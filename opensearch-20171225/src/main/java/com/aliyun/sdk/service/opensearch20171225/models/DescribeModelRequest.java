// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModelRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelRequest</p>
 */
public class DescribeModelRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("modelName")
    @Validation(required = true)
    private String modelName;

    private DescribeModelRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.modelName = builder.modelName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    public static final class Builder extends Request.Builder<DescribeModelRequest, Builder> {
        private String appGroupIdentity; 
        private String modelName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.modelName = response.modelName;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * modelName.
         */
        public Builder modelName(String modelName) {
            this.putPathParameter("modelName", modelName);
            this.modelName = modelName;
            return this;
        }

        @Override
        public DescribeModelRequest build() {
            return new DescribeModelRequest(this);
        } 

    } 

}
