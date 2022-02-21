// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveVersionOfConfigGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveVersionOfConfigGroupResponseBody</p>
 */
public class DescribeActiveVersionOfConfigGroupResponseBody extends TeaModel {
    @NameInMap("BaseVersionId")
    private String baseVersionId;

    @NameInMap("ConfigGroupId")
    private String configGroupId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Operator")
    private String operator;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SeqId")
    private Long seqId;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("VersionId")
    private String versionId;

    private DescribeActiveVersionOfConfigGroupResponseBody(Builder builder) {
        this.baseVersionId = builder.baseVersionId;
        this.configGroupId = builder.configGroupId;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.operator = builder.operator;
        this.requestId = builder.requestId;
        this.seqId = builder.seqId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveVersionOfConfigGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return baseVersionId
     */
    public String getBaseVersionId() {
        return this.baseVersionId;
    }

    /**
     * @return configGroupId
     */
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return seqId
     */
    public Long getSeqId() {
        return this.seqId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String baseVersionId; 
        private String configGroupId; 
        private String createTime; 
        private String description; 
        private String operator; 
        private String requestId; 
        private Long seqId; 
        private String status; 
        private String updateTime; 
        private String versionId; 

        /**
         * BaseVersionId.
         */
        public Builder baseVersionId(String baseVersionId) {
            this.baseVersionId = baseVersionId;
            return this;
        }

        /**
         * ConfigGroupId.
         */
        public Builder configGroupId(String configGroupId) {
            this.configGroupId = configGroupId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
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
         * SeqId.
         */
        public Builder seqId(Long seqId) {
            this.seqId = seqId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public DescribeActiveVersionOfConfigGroupResponseBody build() {
            return new DescribeActiveVersionOfConfigGroupResponseBody(this);
        } 

    } 

}
