// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineStagingCodeUploadInfoRequest} extends {@link RequestModel}
 *
 * <p>GetRoutineStagingCodeUploadInfoRequest</p>
 */
public class GetRoutineStagingCodeUploadInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeDescription")
    private String codeDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private GetRoutineStagingCodeUploadInfoRequest(Builder builder) {
        super(builder);
        this.codeDescription = builder.codeDescription;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineStagingCodeUploadInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeDescription
     */
    public String getCodeDescription() {
        return this.codeDescription;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetRoutineStagingCodeUploadInfoRequest, Builder> {
        private String codeDescription; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetRoutineStagingCodeUploadInfoRequest request) {
            super(request);
            this.codeDescription = request.codeDescription;
            this.name = request.name;
        } 

        /**
         * <p>The code description.</p>
         * 
         * <strong>example:</strong>
         * <p>the description of code</p>
         */
        public Builder codeDescription(String codeDescription) {
            this.putBodyParameter("CodeDescription", codeDescription);
            this.codeDescription = codeDescription;
            return this;
        }

        /**
         * <p>The routine name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GetRoutineStagingCodeUploadInfo</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetRoutineStagingCodeUploadInfoRequest build() {
            return new GetRoutineStagingCodeUploadInfoRequest(this);
        } 

    } 

}
