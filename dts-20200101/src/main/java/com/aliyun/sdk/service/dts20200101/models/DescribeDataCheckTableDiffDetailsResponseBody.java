// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCheckTableDiffDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCheckTableDiffDetailsResponseBody</p>
 */
public class DescribeDataCheckTableDiffDetailsResponseBody extends TeaModel {
    @NameInMap("DbName")
    private String dbName;

    @NameInMap("DiffCount")
    private Long diffCount;

    @NameInMap("DiffDetails")
    private java.util.List < DiffDetails> diffDetails;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TbName")
    private String tbName;

    private DescribeDataCheckTableDiffDetailsResponseBody(Builder builder) {
        this.dbName = builder.dbName;
        this.diffCount = builder.diffCount;
        this.diffDetails = builder.diffDetails;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tbName = builder.tbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCheckTableDiffDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return diffCount
     */
    public Long getDiffCount() {
        return this.diffCount;
    }

    /**
     * @return diffDetails
     */
    public java.util.List < DiffDetails> getDiffDetails() {
        return this.diffDetails;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tbName
     */
    public String getTbName() {
        return this.tbName;
    }

    public static final class Builder {
        private String dbName; 
        private Long diffCount; 
        private java.util.List < DiffDetails> diffDetails; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private String requestId; 
        private Boolean success; 
        private String tbName; 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * DiffCount.
         */
        public Builder diffCount(Long diffCount) {
            this.diffCount = diffCount;
            return this;
        }

        /**
         * DiffDetails.
         */
        public Builder diffDetails(java.util.List < DiffDetails> diffDetails) {
            this.diffDetails = diffDetails;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TbName.
         */
        public Builder tbName(String tbName) {
            this.tbName = tbName;
            return this;
        }

        public DescribeDataCheckTableDiffDetailsResponseBody build() {
            return new DescribeDataCheckTableDiffDetailsResponseBody(this);
        } 

    } 

    public static class DiffDetails extends TeaModel {
        @NameInMap("Diff")
        private String diff;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("Id")
        private Long id;

        private DiffDetails(Builder builder) {
            this.diff = builder.diff;
            this.gmtCreated = builder.gmtCreated;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiffDetails create() {
            return builder().build();
        }

        /**
         * @return diff
         */
        public String getDiff() {
            return this.diff;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String diff; 
            private String gmtCreated; 
            private Long id; 

            /**
             * Diff.
             */
            public Builder diff(String diff) {
                this.diff = diff;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public DiffDetails build() {
                return new DiffDetails(this);
            } 

        } 

    }
}
