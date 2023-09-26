// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomizedInfoRequest</p>
 */
public class CreateCustomizedInfoRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("ApiName")
    @Validation(required = true)
    private String apiName;

    @Query
    @NameInMap("CsharpDemo")
    private String csharpDemo;

    @Query
    @NameInMap("CurlDemo")
    private String curlDemo;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("JavaDemo")
    private String javaDemo;

    @Query
    @NameInMap("ObjectcDemo")
    private String objectcDemo;

    @Query
    @NameInMap("PhpDemo")
    private String phpDemo;

    @Query
    @NameInMap("PythonDemo")
    private String pythonDemo;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageId")
    private String stageId;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    private CreateCustomizedInfoRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.apiName = builder.apiName;
        this.csharpDemo = builder.csharpDemo;
        this.curlDemo = builder.curlDemo;
        this.groupId = builder.groupId;
        this.javaDemo = builder.javaDemo;
        this.objectcDemo = builder.objectcDemo;
        this.phpDemo = builder.phpDemo;
        this.pythonDemo = builder.pythonDemo;
        this.securityToken = builder.securityToken;
        this.stageId = builder.stageId;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return csharpDemo
     */
    public String getCsharpDemo() {
        return this.csharpDemo;
    }

    /**
     * @return curlDemo
     */
    public String getCurlDemo() {
        return this.curlDemo;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return javaDemo
     */
    public String getJavaDemo() {
        return this.javaDemo;
    }

    /**
     * @return objectcDemo
     */
    public String getObjectcDemo() {
        return this.objectcDemo;
    }

    /**
     * @return phpDemo
     */
    public String getPhpDemo() {
        return this.phpDemo;
    }

    /**
     * @return pythonDemo
     */
    public String getPythonDemo() {
        return this.pythonDemo;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageId
     */
    public String getStageId() {
        return this.stageId;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    public static final class Builder extends Request.Builder<CreateCustomizedInfoRequest, Builder> {
        private String apiId; 
        private String apiName; 
        private String csharpDemo; 
        private String curlDemo; 
        private String groupId; 
        private String javaDemo; 
        private String objectcDemo; 
        private String phpDemo; 
        private String pythonDemo; 
        private String securityToken; 
        private String stageId; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomizedInfoRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.apiName = request.apiName;
            this.csharpDemo = request.csharpDemo;
            this.curlDemo = request.curlDemo;
            this.groupId = request.groupId;
            this.javaDemo = request.javaDemo;
            this.objectcDemo = request.objectcDemo;
            this.phpDemo = request.phpDemo;
            this.pythonDemo = request.pythonDemo;
            this.securityToken = request.securityToken;
            this.stageId = request.stageId;
            this.stageName = request.stageName;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * CsharpDemo.
         */
        public Builder csharpDemo(String csharpDemo) {
            this.putQueryParameter("CsharpDemo", csharpDemo);
            this.csharpDemo = csharpDemo;
            return this;
        }

        /**
         * CurlDemo.
         */
        public Builder curlDemo(String curlDemo) {
            this.putQueryParameter("CurlDemo", curlDemo);
            this.curlDemo = curlDemo;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * JavaDemo.
         */
        public Builder javaDemo(String javaDemo) {
            this.putQueryParameter("JavaDemo", javaDemo);
            this.javaDemo = javaDemo;
            return this;
        }

        /**
         * ObjectcDemo.
         */
        public Builder objectcDemo(String objectcDemo) {
            this.putQueryParameter("ObjectcDemo", objectcDemo);
            this.objectcDemo = objectcDemo;
            return this;
        }

        /**
         * PhpDemo.
         */
        public Builder phpDemo(String phpDemo) {
            this.putQueryParameter("PhpDemo", phpDemo);
            this.phpDemo = phpDemo;
            return this;
        }

        /**
         * PythonDemo.
         */
        public Builder pythonDemo(String pythonDemo) {
            this.putQueryParameter("PythonDemo", pythonDemo);
            this.pythonDemo = pythonDemo;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StageId.
         */
        public Builder stageId(String stageId) {
            this.putQueryParameter("StageId", stageId);
            this.stageId = stageId;
            return this;
        }

        /**
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public CreateCustomizedInfoRequest build() {
            return new CreateCustomizedInfoRequest(this);
        } 

    } 

}
