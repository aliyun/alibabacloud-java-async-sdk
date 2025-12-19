// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeGrantRulesToEcrResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesToEcrResponseBody</p>
 */
public class DescribeGrantRulesToEcrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("EcrGrantRules")
    private java.util.List<EcrGrantRules> ecrGrantRules;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGrantRulesToEcrResponseBody(Builder builder) {
        this.count = builder.count;
        this.ecrGrantRules = builder.ecrGrantRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantRulesToEcrResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ecrGrantRules
     */
    public java.util.List<EcrGrantRules> getEcrGrantRules() {
        return this.ecrGrantRules;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<EcrGrantRules> ecrGrantRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeGrantRulesToEcrResponseBody model) {
            this.count = model.count;
            this.ecrGrantRules = model.ecrGrantRules;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The cross-account authorization list of the ECR</p>
         */
        public Builder ecrGrantRules(java.util.List<EcrGrantRules> ecrGrantRules) {
            this.ecrGrantRules = ecrGrantRules;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries on each page. Maximum value: 50. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C1CCAB91-6AE6-50E3-AAA3-D0E5A2BC6ADE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGrantRulesToEcrResponseBody build() {
            return new DescribeGrantRulesToEcrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGrantRulesToEcrResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantRulesToEcrResponseBody</p>
     */
    public static class EcrGrantRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EcrInstanceId")
        private String ecrInstanceId;

        @com.aliyun.core.annotation.NameInMap("EcrUid")
        private Long ecrUid;

        private EcrGrantRules(Builder builder) {
            this.createTime = builder.createTime;
            this.ecrInstanceId = builder.ecrInstanceId;
            this.ecrUid = builder.ecrUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcrGrantRules create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ecrInstanceId
         */
        public String getEcrInstanceId() {
            return this.ecrInstanceId;
        }

        /**
         * @return ecrUid
         */
        public Long getEcrUid() {
            return this.ecrUid;
        }

        public static final class Builder {
            private String createTime; 
            private String ecrInstanceId; 
            private Long ecrUid; 

            private Builder() {
            } 

            private Builder(EcrGrantRules model) {
                this.createTime = model.createTime;
                this.ecrInstanceId = model.ecrInstanceId;
                this.ecrUid = model.ecrUid;
            } 

            /**
             * <p>The authorization time. The time follows the ISO8601 standard and uses UTC time. The format is YYYY-MM-DDThh:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-15T14:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ECR account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecr-xxxxxx</p>
             */
            public Builder ecrInstanceId(String ecrInstanceId) {
                this.ecrInstanceId = ecrInstanceId;
                return this;
            }

            /**
             * <p>The ECR account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11111111111</p>
             */
            public Builder ecrUid(Long ecrUid) {
                this.ecrUid = ecrUid;
                return this;
            }

            public EcrGrantRules build() {
                return new EcrGrantRules(this);
            } 

        } 

    }
}
