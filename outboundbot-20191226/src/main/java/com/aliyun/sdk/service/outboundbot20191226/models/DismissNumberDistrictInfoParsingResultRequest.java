// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DismissNumberDistrictInfoParsingResultRequest} extends {@link RequestModel}
 *
 * <p>DismissNumberDistrictInfoParsingResultRequest</p>
 */
public class DismissNumberDistrictInfoParsingResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private DismissNumberDistrictInfoParsingResultRequest(Builder builder) {
        super(builder);
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DismissNumberDistrictInfoParsingResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DismissNumberDistrictInfoParsingResultRequest, Builder> {
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DismissNumberDistrictInfoParsingResultRequest request) {
            super(request);
            this.versionId = request.versionId;
        } 

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DismissNumberDistrictInfoParsingResultRequest build() {
            return new DismissNumberDistrictInfoParsingResultRequest(this);
        } 

    } 

}
