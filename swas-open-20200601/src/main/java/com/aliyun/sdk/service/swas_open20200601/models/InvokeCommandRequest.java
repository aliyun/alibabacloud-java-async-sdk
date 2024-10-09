// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InvokeCommandRequest} extends {@link RequestModel}
 *
 * <p>InvokeCommandRequest</p>
 */
public class InvokeCommandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private InvokeCommandRequest(Builder builder) {
        super(builder);
        this.commandId = builder.commandId;
        this.instanceIds = builder.instanceIds;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<InvokeCommandRequest, Builder> {
        private String commandId; 
        private String instanceIds; 
        private java.util.Map < String, ? > parameters; 
        private String regionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(InvokeCommandRequest request) {
            super(request);
            this.commandId = request.commandId;
            this.instanceIds = request.instanceIds;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.username = request.username;
        } 

        /**
         * <p>The command ID. You can call the DescribeCommands operation to query all available command IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-sh02yh0932w****</p>
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>The IDs of the simple application servers. The value can be a JSON array that consists of up to 50 IDs of simple application servers. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;2ad1ae67295445f598017499dc****&quot;, &quot;2ad1ae67295445f598017123dc****&quot;]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The key-value pairs of custom parameters to specify when the custom parameter feature is enabled.</p>
         * <ul>
         * <li>You can specify up to 10 custom parameters. Each key in a Map collection cannot be an empty string and can be up to 64 characters in length.</li>
         * <li>Values in a Map collection can be empty strings. The total length of the custom parameters and the original command cannot exceed 18 KB after they are encoded in Base64.</li>
         * <li>The custom parameter names that you specify for the Parameters parameter must be included in the custom parameter names that you specified when you created the command.</li>
         * <li>You can use empty strings to represent the custom parameters that are not specified. If you want to disable the custom parameter feature, you can leave this parameter empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;delayed_insert_timeout&quot;:&quot;600&quot;,&quot;max_length_for_sort_data&quot;:&quot;2048&quot;}</p>
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the user who runs the command in a simple application server. The username cannot exceed 255 characters in length.</p>
         * <ul>
         * <li>For Linux servers, the default value is the root username.</li>
         * <li>For Windows servers, the default value is the system username.</li>
         * </ul>
         * <p>You can change the user to run the command only for Linux simple application servers.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public InvokeCommandRequest build() {
            return new InvokeCommandRequest(this);
        } 

    } 

}
