// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetStackPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetStackPolicyRequest</p>
 */
public class SetStackPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackPolicyBody")
    private String stackPolicyBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackPolicyURL")
    private String stackPolicyURL;

    private SetStackPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.stackPolicyBody = builder.stackPolicyBody;
        this.stackPolicyURL = builder.stackPolicyURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetStackPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return stackPolicyBody
     */
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    /**
     * @return stackPolicyURL
     */
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public static final class Builder extends Request.Builder<SetStackPolicyRequest, Builder> {
        private String regionId; 
        private String stackId; 
        private String stackPolicyBody; 
        private String stackPolicyURL; 

        private Builder() {
            super();
        } 

        private Builder(SetStackPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.stackPolicyBody = request.stackPolicyBody;
            this.stackPolicyURL = request.stackPolicyURL;
        } 

        /**
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the stack.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.</p>
         * <p>You can specify one of the StackPolicyBody and StackPolicyURL parameters, but you cannot specify both of them.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:&quot;Update:<em>&quot;,&quot;Principal&quot;:&quot;</em>&quot;,&quot;Resource&quot;:&quot;*&quot;}]}</p>
         */
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.putQueryParameter("StackPolicyBody", stackPolicyBody);
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        /**
         * <p>The URL for the file that contains the stack policy. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template can be up to 16,384 bytes in length, and the URL can be up to 1,350 bytes in length.</p>
         * <blockquote>
         * <p> If the region of the OSS bucket is not specified, the RegionId value is used.</p>
         * </blockquote>
         * <p>You can specify one of the StackPolicyBody and StackPolicyURL parameters, but you cannot specify both of them.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://ros/stack-policy/demo</p>
         */
        public Builder stackPolicyURL(String stackPolicyURL) {
            this.putQueryParameter("StackPolicyURL", stackPolicyURL);
            this.stackPolicyURL = stackPolicyURL;
            return this;
        }

        @Override
        public SetStackPolicyRequest build() {
            return new SetStackPolicyRequest(this);
        } 

    } 

}
