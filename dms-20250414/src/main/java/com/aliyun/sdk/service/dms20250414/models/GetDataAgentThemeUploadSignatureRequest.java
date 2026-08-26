// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataAgentThemeUploadSignatureRequest} extends {@link RequestModel}
 *
 * <p>GetDataAgentThemeUploadSignatureRequest</p>
 */
public class GetDataAgentThemeUploadSignatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeId")
    private String themeId;

    private GetDataAgentThemeUploadSignatureRequest(Builder builder) {
        super(builder);
        this.themeId = builder.themeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentThemeUploadSignatureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return themeId
     */
    public String getThemeId() {
        return this.themeId;
    }

    public static final class Builder extends Request.Builder<GetDataAgentThemeUploadSignatureRequest, Builder> {
        private String themeId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataAgentThemeUploadSignatureRequest request) {
            super(request);
            this.themeId = request.themeId;
        } 

        /**
         * ThemeId.
         */
        public Builder themeId(String themeId) {
            this.putQueryParameter("ThemeId", themeId);
            this.themeId = themeId;
            return this;
        }

        @Override
        public GetDataAgentThemeUploadSignatureRequest build() {
            return new GetDataAgentThemeUploadSignatureRequest(this);
        } 

    } 

}
