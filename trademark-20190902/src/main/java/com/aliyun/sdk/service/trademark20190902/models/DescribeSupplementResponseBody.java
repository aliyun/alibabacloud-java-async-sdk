// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupplementResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupplementResponseBody</p>
 */
public class DescribeSupplementResponseBody extends TeaModel {
    @NameInMap("AcceptExpirationDate")
    private Long acceptExpirationDate;

    @NameInMap("AcceptTime")
    private Long acceptTime;

    @NameInMap("ApplicationType")
    private Integer applicationType;

    @NameInMap("Content")
    private String content;

    @NameInMap("OfficialFile")
    private String officialFile;

    @NameInMap("OperateTime")
    private Long operateTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SbjExpirationDate")
    private Long sbjExpirationDate;

    @NameInMap("SendTime")
    private Long sendTime;

    @NameInMap("SerialNumber")
    private String serialNumber;

    @NameInMap("SupplementId")
    private Long supplementId;

    @NameInMap("SupplementStatus")
    private Integer supplementStatus;

    @NameInMap("TrademarkNumber")
    private String trademarkNumber;

    @NameInMap("UserFiles")
    private UserFiles userFiles;

    private DescribeSupplementResponseBody(Builder builder) {
        this.acceptExpirationDate = builder.acceptExpirationDate;
        this.acceptTime = builder.acceptTime;
        this.applicationType = builder.applicationType;
        this.content = builder.content;
        this.officialFile = builder.officialFile;
        this.operateTime = builder.operateTime;
        this.requestId = builder.requestId;
        this.sbjExpirationDate = builder.sbjExpirationDate;
        this.sendTime = builder.sendTime;
        this.serialNumber = builder.serialNumber;
        this.supplementId = builder.supplementId;
        this.supplementStatus = builder.supplementStatus;
        this.trademarkNumber = builder.trademarkNumber;
        this.userFiles = builder.userFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupplementResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceptExpirationDate
     */
    public Long getAcceptExpirationDate() {
        return this.acceptExpirationDate;
    }

    /**
     * @return acceptTime
     */
    public Long getAcceptTime() {
        return this.acceptTime;
    }

    /**
     * @return applicationType
     */
    public Integer getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return officialFile
     */
    public String getOfficialFile() {
        return this.officialFile;
    }

    /**
     * @return operateTime
     */
    public Long getOperateTime() {
        return this.operateTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sbjExpirationDate
     */
    public Long getSbjExpirationDate() {
        return this.sbjExpirationDate;
    }

    /**
     * @return sendTime
     */
    public Long getSendTime() {
        return this.sendTime;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return supplementId
     */
    public Long getSupplementId() {
        return this.supplementId;
    }

    /**
     * @return supplementStatus
     */
    public Integer getSupplementStatus() {
        return this.supplementStatus;
    }

    /**
     * @return trademarkNumber
     */
    public String getTrademarkNumber() {
        return this.trademarkNumber;
    }

    /**
     * @return userFiles
     */
    public UserFiles getUserFiles() {
        return this.userFiles;
    }

    public static final class Builder {
        private Long acceptExpirationDate; 
        private Long acceptTime; 
        private Integer applicationType; 
        private String content; 
        private String officialFile; 
        private Long operateTime; 
        private String requestId; 
        private Long sbjExpirationDate; 
        private Long sendTime; 
        private String serialNumber; 
        private Long supplementId; 
        private Integer supplementStatus; 
        private String trademarkNumber; 
        private UserFiles userFiles; 

        /**
         * AcceptExpirationDate.
         */
        public Builder acceptExpirationDate(Long acceptExpirationDate) {
            this.acceptExpirationDate = acceptExpirationDate;
            return this;
        }

        /**
         * AcceptTime.
         */
        public Builder acceptTime(Long acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }

        /**
         * ApplicationType.
         */
        public Builder applicationType(Integer applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * OfficialFile.
         */
        public Builder officialFile(String officialFile) {
            this.officialFile = officialFile;
            return this;
        }

        /**
         * OperateTime.
         */
        public Builder operateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SbjExpirationDate.
         */
        public Builder sbjExpirationDate(Long sbjExpirationDate) {
            this.sbjExpirationDate = sbjExpirationDate;
            return this;
        }

        /**
         * SendTime.
         */
        public Builder sendTime(Long sendTime) {
            this.sendTime = sendTime;
            return this;
        }

        /**
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * SupplementId.
         */
        public Builder supplementId(Long supplementId) {
            this.supplementId = supplementId;
            return this;
        }

        /**
         * SupplementStatus.
         */
        public Builder supplementStatus(Integer supplementStatus) {
            this.supplementStatus = supplementStatus;
            return this;
        }

        /**
         * TrademarkNumber.
         */
        public Builder trademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }

        /**
         * UserFiles.
         */
        public Builder userFiles(UserFiles userFiles) {
            this.userFiles = userFiles;
            return this;
        }

        public DescribeSupplementResponseBody build() {
            return new DescribeSupplementResponseBody(this);
        } 

    } 

    public static class UserFiles extends TeaModel {
        @NameInMap("UserFile")
        private java.util.List < String > userFile;

        private UserFiles(Builder builder) {
            this.userFile = builder.userFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserFiles create() {
            return builder().build();
        }

        /**
         * @return userFile
         */
        public java.util.List < String > getUserFile() {
            return this.userFile;
        }

        public static final class Builder {
            private java.util.List < String > userFile; 

            /**
             * UserFile.
             */
            public Builder userFile(java.util.List < String > userFile) {
                this.userFile = userFile;
                return this;
            }

            public UserFiles build() {
                return new UserFiles(this);
            } 

        } 

    }
}
