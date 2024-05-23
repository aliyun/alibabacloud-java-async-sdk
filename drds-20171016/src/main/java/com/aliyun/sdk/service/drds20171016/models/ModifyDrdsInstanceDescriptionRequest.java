// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDrdsInstanceDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyDrdsInstanceDescriptionRequest</p>
 */
public class ModifyDrdsInstanceDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    private ModifyDrdsInstanceDescriptionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDrdsInstanceDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyDrdsInstanceDescriptionRequest, Builder> {
        private String description; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDrdsInstanceDescriptionRequest request) {
            super(request);
            this.description = request.description;
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public ModifyDrdsInstanceDescriptionRequest build() {
            return new ModifyDrdsInstanceDescriptionRequest(this);
        } 

    } 

}
