// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadRoutineCodeRequest} extends {@link RequestModel}
 *
 * <p>UploadRoutineCodeRequest</p>
 */
public class UploadRoutineCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private UploadRoutineCodeRequest(Builder builder) {
        super(builder);
        this.codeDescription = builder.codeDescription;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadRoutineCodeRequest create() {
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

    public static final class Builder extends Request.Builder<UploadRoutineCodeRequest, Builder> {
        private String codeDescription; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UploadRoutineCodeRequest request) {
            super(request);
            this.codeDescription = request.codeDescription;
            this.name = request.name;
        } 

        /**
         * The description of the code version.
         */
        public Builder codeDescription(String codeDescription) {
            this.putBodyParameter("CodeDescription", codeDescription);
            this.codeDescription = codeDescription;
            return this;
        }

        /**
         * The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UploadRoutineCodeRequest build() {
            return new UploadRoutineCodeRequest(this);
        } 

    } 

}
