// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorTaskRequest</p>
 */
public class CreateMonitorTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cycleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cycleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("listdayStr")
    private String listdayStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private CreateMonitorTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.bizType = builder.bizType;
        this.cycleType = builder.cycleType;
        this.endTime = builder.endTime;
        this.filePath = builder.filePath;
        this.listdayStr = builder.listdayStr;
        this.regId = builder.regId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return cycleType
     */
    public String getCycleType() {
        return this.cycleType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return listdayStr
     */
    public String getListdayStr() {
        return this.listdayStr;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateMonitorTaskRequest, Builder> {
        private String lang; 
        private String bizType; 
        private String cycleType; 
        private Long endTime; 
        private String filePath; 
        private String listdayStr; 
        private String regId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.bizType = request.bizType;
            this.cycleType = request.cycleType;
            this.endTime = request.endTime;
            this.filePath = request.filePath;
            this.listdayStr = request.listdayStr;
            this.regId = request.regId;
            this.startTime = request.startTime;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * bizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("bizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * cycleType.
         */
        public Builder cycleType(String cycleType) {
            this.putQueryParameter("cycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * filePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * listdayStr.
         */
        public Builder listdayStr(String listdayStr) {
            this.putQueryParameter("listdayStr", listdayStr);
            this.listdayStr = listdayStr;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateMonitorTaskRequest build() {
            return new CreateMonitorTaskRequest(this);
        } 

    } 

}
