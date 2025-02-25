// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadRobotTaskCalledFileRequest} extends {@link RequestModel}
 *
 * <p>UploadRobotTaskCalledFileRequest</p>
 */
public class UploadRobotTaskCalledFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsParam")
    private String ttsParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsParamHead")
    private String ttsParamHead;

    private UploadRobotTaskCalledFileRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ttsParam = builder.ttsParam;
        this.ttsParamHead = builder.ttsParamHead;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadRobotTaskCalledFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return ttsParam
     */
    public String getTtsParam() {
        return this.ttsParam;
    }

    /**
     * @return ttsParamHead
     */
    public String getTtsParamHead() {
        return this.ttsParamHead;
    }

    public static final class Builder extends Request.Builder<UploadRobotTaskCalledFileRequest, Builder> {
        private String calledNumber; 
        private Long id; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ttsParam; 
        private String ttsParamHead; 

        private Builder() {
            super();
        } 

        private Builder(UploadRobotTaskCalledFileRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.id = request.id;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ttsParam = request.ttsParam;
            this.ttsParamHead = request.ttsParamHead;
        } 

        /**
         * <p>The called numbers. Separate multiple called numbers with commas (,).</p>
         * <blockquote>
         * <p>After you create a robocall task, you must upload called numbers in batches. You can upload up to 300,000 called numbers for each task.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1370<strong><strong>000,1370</strong></strong>111</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The unique ID of the robocall task. You can call the <a href="~~CreateRobotTask~~">CreateRobotTask</a> operation to obtain the ID of the robocall task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1045****</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The values of the variable in the text-to-speech (TTS) template, in the JSON format. The variable values specified by the TtsParam parameter must match the variable names specified by the TtsParamHead parameter.</p>
         * <ul>
         * <li>If all the called numbers carry the same variable values, you can set the value of the number field to <strong>all</strong> and upload only one copy of the variable values.</li>
         * <li>If only some of the called numbers carry the same variable values, you can set the value of the number field to <strong>all</strong> for these called numbers and set the value of the number field and variable values for other called numbers based on your business requirements. The system preferentially selects the values that you set for the called numbers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;number&quot;:&quot;1370****000&quot;,&quot;params&quot;:[&quot;xiaowang&quot;,&quot;xiaoli&quot;,&quot;xiaozhou&quot;]}]</p>
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * <p>The list of variable names carried in the robocall task, in the JSON format. The TtsParamHead parameter must be used together with the TtsParam parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;name1&quot;,&quot;name2&quot;,&quot;name3&quot;]</p>
         */
        public Builder ttsParamHead(String ttsParamHead) {
            this.putQueryParameter("TtsParamHead", ttsParamHead);
            this.ttsParamHead = ttsParamHead;
            return this;
        }

        @Override
        public UploadRobotTaskCalledFileRequest build() {
            return new UploadRobotTaskCalledFileRequest(this);
        } 

    } 

}
