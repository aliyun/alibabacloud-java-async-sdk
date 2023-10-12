// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigurationVariateRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigurationVariateRequest</p>
 */
public class CreateConfigurationVariateRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Comment")
    private String comment;

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

    private CreateConfigurationVariateRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.comment = builder.comment;
        this.formatFunction = builder.formatFunction;
        this.instanceId = builder.instanceId;
        this.variateName = builder.variateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigurationVariateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
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

    public static final class Builder extends Request.Builder<CreateConfigurationVariateRequest, Builder> {
        private String clientToken; 
        private String comment; 
        private String formatFunction; 
        private String instanceId; 
        private String variateName; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigurationVariateRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.comment = request.comment;
            this.formatFunction = request.formatFunction;
            this.instanceId = request.instanceId;
            this.variateName = request.variateName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * 代表资源名称的资源属性字段
         */
        public Builder variateName(String variateName) {
            this.putBodyParameter("VariateName", variateName);
            this.variateName = variateName;
            return this;
        }

        @Override
        public CreateConfigurationVariateRequest build() {
            return new CreateConfigurationVariateRequest(this);
        } 

    } 

}
