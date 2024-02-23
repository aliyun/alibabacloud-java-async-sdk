// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadRobotTaskCalledFileRequest} extends {@link RequestModel}
 *
 * <p>UploadRobotTaskCalledFileRequest</p>
 */
public class UploadRobotTaskCalledFileRequest extends Request {
    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TtsParam")
    private String ttsParam;

    @Query
    @NameInMap("TtsParamHead")
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
         * The called numbers. Separate multiple called numbers with commas (,).
         * <p>
         * 
         * > After you create a robocall task, you must upload called numbers in batches. You can upload up to 300,000 called numbers for each task.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * The unique ID of the robocall task. You can call the [CreateRobotTask](~~CreateRobotTask~~) operation to obtain the ID of the robocall task.
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
         * The values of the variable in the text-to-speech (TTS) template, in the JSON format. The variable values specified by the TtsParam parameter must match the variable names specified by the TtsParamHead parameter.
         * <p>
         * 
         * *   If all the called numbers carry the same variable values, you can set the value of the number field to **all** and upload only one copy of the variable values.
         * *   If only some of the called numbers carry the same variable values, you can set the value of the number field to **all** for these called numbers and set the value of the number field and variable values for other called numbers based on your business requirements. The system preferentially selects the values that you set for the called numbers.
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * The list of variable names carried in the robocall task, in the JSON format. The TtsParamHead parameter must be used together with the TtsParam parameter.
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
