// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteIndexPageBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteIndexPageBaselineResponseBody</p>
 */
public class DescribeWebsiteIndexPageBaselineResponseBody extends TeaModel {
    @NameInMap("BaseLineStatus")
    private String baseLineStatus;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshot")
    private String snapshot;

    private DescribeWebsiteIndexPageBaselineResponseBody(Builder builder) {
        this.baseLineStatus = builder.baseLineStatus;
        this.createTime = builder.createTime;
        this.requestId = builder.requestId;
        this.snapshot = builder.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteIndexPageBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return baseLineStatus
     */
    public String getBaseLineStatus() {
        return this.baseLineStatus;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshot
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    public static final class Builder {
        private String baseLineStatus; 
        private String createTime; 
        private String requestId; 
        private String snapshot; 

        /**
         * BaseLineStatus.
         */
        public Builder baseLineStatus(String baseLineStatus) {
            this.baseLineStatus = baseLineStatus;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Snapshot.
         */
        public Builder snapshot(String snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public DescribeWebsiteIndexPageBaselineResponseBody build() {
            return new DescribeWebsiteIndexPageBaselineResponseBody(this);
        } 

    } 

}
