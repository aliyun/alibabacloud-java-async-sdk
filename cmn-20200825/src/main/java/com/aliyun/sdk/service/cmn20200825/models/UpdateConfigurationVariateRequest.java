// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigurationVariateRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigurationVariateRequest</p>
 */
public class UpdateConfigurationVariateRequest extends Request {
    @Body
    @NameInMap("Comment")
    private String comment;

    @Body
    @NameInMap("ConfigurationVariateId")
    @Validation(required = true)
    private String configurationVariateId;

    @Body
    @NameInMap("FormatFunction")
    private String formatFunction;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("VariateName")
    @Validation(required = true)
    private String variateName;

    private UpdateConfigurationVariateRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.configurationVariateId = builder.configurationVariateId;
        this.formatFunction = builder.formatFunction;
        this.instanceId = builder.instanceId;
        this.variateName = builder.variateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigurationVariateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return configurationVariateId
     */
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    /**
     * @return formatFunction
     */
    public String getFormatFunction() {
        return this.formatFunction;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return variateName
     */
    public String getVariateName() {
        return this.variateName;
    }

    public static final class Builder extends Request.Builder<UpdateConfigurationVariateRequest, Builder> {
        private String comment; 
        private String configurationVariateId; 
        private String formatFunction; 
        private String instanceId; 
        private String variateName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigurationVariateRequest request) {
            super(request);
            this.comment = request.comment;
            this.configurationVariateId = request.configurationVariateId;
            this.formatFunction = request.formatFunction;
            this.instanceId = request.instanceId;
            this.variateName = request.variateName;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder configurationVariateId(String configurationVariateId) {
            this.putBodyParameter("ConfigurationVariateId", configurationVariateId);
            this.configurationVariateId = configurationVariateId;
            return this;
        }

        /**
         * FormatFunction.
         */
        public Builder formatFunction(String formatFunction) {
            this.putBodyParameter("FormatFunction", formatFunction);
            this.formatFunction = formatFunction;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * VariateName.
         */
        public Builder variateName(String variateName) {
            this.putBodyParameter("VariateName", variateName);
            this.variateName = variateName;
            return this;
        }

        @Override
        public UpdateConfigurationVariateRequest build() {
            return new UpdateConfigurationVariateRequest(this);
        } 

    } 

}
