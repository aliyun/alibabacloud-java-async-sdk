// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PushRpaTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>PushRpaTaskDetailRequest</p>
 */
public class PushRpaTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunKp")
    private String aliyunKp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiType")
    private String apiType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputData")
    private String inputData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputHtml")
    private String inputHtml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputScreenshot")
    private String inputScreenshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelDetailId")
    private Long modelDetailId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginalRequest")
    private String originalRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputData")
    private String outputData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputHtml")
    private String outputHtml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputScreenshot")
    private String outputScreenshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskDetailId")
    private Long taskDetailId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserBid")
    private String userBid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCallerParentId")
    private Long userCallerParentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCallerType")
    private String userCallerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserKp")
    private String userKp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSecurityToken")
    private String userSecurityToken;

    private PushRpaTaskDetailRequest(Builder builder) {
        super(builder);
        this.aliyunKp = builder.aliyunKp;
        this.apiType = builder.apiType;
        this.bid = builder.bid;
        this.inputData = builder.inputData;
        this.inputHtml = builder.inputHtml;
        this.inputScreenshot = builder.inputScreenshot;
        this.lang = builder.lang;
        this.modelDetailId = builder.modelDetailId;
        this.originalRequest = builder.originalRequest;
        this.outputData = builder.outputData;
        this.outputHtml = builder.outputHtml;
        this.outputScreenshot = builder.outputScreenshot;
        this.status = builder.status;
        this.taskDetailId = builder.taskDetailId;
        this.taskId = builder.taskId;
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userBid = builder.userBid;
        this.userCallerParentId = builder.userCallerParentId;
        this.userCallerType = builder.userCallerType;
        this.userClientIp = builder.userClientIp;
        this.userKp = builder.userKp;
        this.userSecurityToken = builder.userSecurityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushRpaTaskDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunKp
     */
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return inputData
     */
    public String getInputData() {
        return this.inputData;
    }

    /**
     * @return inputHtml
     */
    public String getInputHtml() {
        return this.inputHtml;
    }

    /**
     * @return inputScreenshot
     */
    public String getInputScreenshot() {
        return this.inputScreenshot;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return modelDetailId
     */
    public Long getModelDetailId() {
        return this.modelDetailId;
    }

    /**
     * @return originalRequest
     */
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    /**
     * @return outputData
     */
    public String getOutputData() {
        return this.outputData;
    }

    /**
     * @return outputHtml
     */
    public String getOutputHtml() {
        return this.outputHtml;
    }

    /**
     * @return outputScreenshot
     */
    public String getOutputScreenshot() {
        return this.outputScreenshot;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskDetailId
     */
    public Long getTaskDetailId() {
        return this.taskDetailId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return userAccessKeyId
     */
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    /**
     * @return userBid
     */
    public String getUserBid() {
        return this.userBid;
    }

    /**
     * @return userCallerParentId
     */
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    /**
     * @return userCallerType
     */
    public String getUserCallerType() {
        return this.userCallerType;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return userKp
     */
    public String getUserKp() {
        return this.userKp;
    }

    /**
     * @return userSecurityToken
     */
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

    public static final class Builder extends Request.Builder<PushRpaTaskDetailRequest, Builder> {
        private String aliyunKp; 
        private String apiType; 
        private String bid; 
        private String inputData; 
        private String inputHtml; 
        private String inputScreenshot; 
        private String lang; 
        private Long modelDetailId; 
        private String originalRequest; 
        private String outputData; 
        private String outputHtml; 
        private String outputScreenshot; 
        private Integer status; 
        private Long taskDetailId; 
        private Long taskId; 
        private String userAccessKeyId; 
        private String userBid; 
        private Long userCallerParentId; 
        private String userCallerType; 
        private String userClientIp; 
        private String userKp; 
        private String userSecurityToken; 

        private Builder() {
            super();
        } 

        private Builder(PushRpaTaskDetailRequest request) {
            super(request);
            this.aliyunKp = request.aliyunKp;
            this.apiType = request.apiType;
            this.bid = request.bid;
            this.inputData = request.inputData;
            this.inputHtml = request.inputHtml;
            this.inputScreenshot = request.inputScreenshot;
            this.lang = request.lang;
            this.modelDetailId = request.modelDetailId;
            this.originalRequest = request.originalRequest;
            this.outputData = request.outputData;
            this.outputHtml = request.outputHtml;
            this.outputScreenshot = request.outputScreenshot;
            this.status = request.status;
            this.taskDetailId = request.taskDetailId;
            this.taskId = request.taskId;
            this.userAccessKeyId = request.userAccessKeyId;
            this.userBid = request.userBid;
            this.userCallerParentId = request.userCallerParentId;
            this.userCallerType = request.userCallerType;
            this.userClientIp = request.userClientIp;
            this.userKp = request.userKp;
            this.userSecurityToken = request.userSecurityToken;
        } 

        /**
         * <p>aliyunKp</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder aliyunKp(String aliyunKp) {
            this.putQueryParameter("AliyunKp", aliyunKp);
            this.aliyunKp = aliyunKp;
            return this;
        }

        /**
         * <p>apiType</p>
         * 
         * <strong>example:</strong>
         * <p>MPC</p>
         */
        public Builder apiType(String apiType) {
            this.putQueryParameter("ApiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * <p>bid</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        public Builder bid(String bid) {
            this.putQueryParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * <p>inputData</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://wssq.sbj.cnipa.gov.cn:9080/tmsve/wssqsy_getCayzDl.xhtml">http://wssq.sbj.cnipa.gov.cn:9080/tmsve/wssqsy_getCayzDl.xhtml</a></p>
         */
        public Builder inputData(String inputData) {
            this.putQueryParameter("InputData", inputData);
            this.inputData = inputData;
            return this;
        }

        /**
         * <p>inputHtml</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder inputHtml(String inputHtml) {
            this.putQueryParameter("InputHtml", inputHtml);
            this.inputHtml = inputHtml;
            return this;
        }

        /**
         * <p>inputScreenshot</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder inputScreenshot(String inputScreenshot) {
            this.putQueryParameter("InputScreenshot", inputScreenshot);
            this.inputScreenshot = inputScreenshot;
            return this;
        }

        /**
         * <p>lang</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>modelDetailId</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder modelDetailId(Long modelDetailId) {
            this.putQueryParameter("ModelDetailId", modelDetailId);
            this.modelDetailId = modelDetailId;
            return this;
        }

        /**
         * <p>originalRequest</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder originalRequest(String originalRequest) {
            this.putQueryParameter("OriginalRequest", originalRequest);
            this.originalRequest = originalRequest;
            return this;
        }

        /**
         * <p>outputData</p>
         */
        public Builder outputData(String outputData) {
            this.putQueryParameter("OutputData", outputData);
            this.outputData = outputData;
            return this;
        }

        /**
         * <p>outputHtml</p>
         * 
         * <strong>example:</strong>
         * <div class=\"photobox\" id=\"Layer3\" style=\"visibility: visible
         */
        public Builder outputHtml(String outputHtml) {
            this.putQueryParameter("OutputHtml", outputHtml);
            this.outputHtml = outputHtml;
            return this;
        }

        /**
         * <p>outputScreenshot</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dbu-nap-p-test.oss-cn-beijing.aliyuncs.com/202301/20230110/5782089/1673334129101-d111874e-f181-4d1c-8edc-83e789975329.jpg?Expires=1675926129&OSSAccessKeyId=hObpgEXoca42qH3V&Signature=------">http://dbu-nap-p-test.oss-cn-beijing.aliyuncs.com/202301/20230110/5782089/1673334129101-d111874e-f181-4d1c-8edc-83e789975329.jpg?Expires=1675926129&amp;OSSAccessKeyId=hObpgEXoca42qH3V&amp;Signature=------</a></p>
         */
        public Builder outputScreenshot(String outputScreenshot) {
            this.putQueryParameter("OutputScreenshot", outputScreenshot);
            this.outputScreenshot = outputScreenshot;
            return this;
        }

        /**
         * <p>status</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>taskDetailId</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskDetailId(Long taskDetailId) {
            this.putQueryParameter("TaskDetailId", taskDetailId);
            this.taskDetailId = taskDetailId;
            return this;
        }

        /**
         * <p>taskId</p>
         * 
         * <strong>example:</strong>
         * <p>5596654</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>userAccessKeyId</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * <p>userBid</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userBid(String userBid) {
            this.putQueryParameter("UserBid", userBid);
            this.userBid = userBid;
            return this;
        }

        /**
         * <p>userCallerParentId</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userCallerParentId(Long userCallerParentId) {
            this.putQueryParameter("UserCallerParentId", userCallerParentId);
            this.userCallerParentId = userCallerParentId;
            return this;
        }

        /**
         * <p>userCallerType</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userCallerType(String userCallerType) {
            this.putQueryParameter("UserCallerType", userCallerType);
            this.userCallerType = userCallerType;
            return this;
        }

        /**
         * <p>userClientIp</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>userKp</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userKp(String userKp) {
            this.putQueryParameter("UserKp", userKp);
            this.userKp = userKp;
            return this;
        }

        /**
         * <p>userSecurityToken</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userSecurityToken(String userSecurityToken) {
            this.putQueryParameter("UserSecurityToken", userSecurityToken);
            this.userSecurityToken = userSecurityToken;
            return this;
        }

        @Override
        public PushRpaTaskDetailRequest build() {
            return new PushRpaTaskDetailRequest(this);
        } 

    } 

}
