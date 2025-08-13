// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeRuleHitRequest} extends {@link RequestModel}
 *
 * <p>DescribeRuleHitRequest</p>
 */
public class DescribeRuleHitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestTime")
    private Long requestTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleSnapshotId")
    private String ruleSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sRequestId")
    private String sRequestId;

    private DescribeRuleHitRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.requestTime = builder.requestTime;
        this.ruleId = builder.ruleId;
        this.ruleSnapshotId = builder.ruleSnapshotId;
        this.sRequestId = builder.sRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return requestTime
     */
    public Long getRequestTime() {
        return this.requestTime;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleSnapshotId
     */
    public String getRuleSnapshotId() {
        return this.ruleSnapshotId;
    }

    /**
     * @return sRequestId
     */
    public String getSRequestId() {
        return this.sRequestId;
    }

    public static final class Builder extends Request.Builder<DescribeRuleHitRequest, Builder> {
        private String lang; 
        private String regId; 
        private Long requestTime; 
        private String ruleId; 
        private String ruleSnapshotId; 
        private String sRequestId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRuleHitRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.requestTime = request.requestTime;
            this.ruleId = request.ruleId;
            this.ruleSnapshotId = request.ruleSnapshotId;
            this.sRequestId = request.sRequestId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Execution time</p>
         * 
         * <strong>example:</strong>
         * <p>1752571330000</p>
         */
        public Builder requestTime(Long requestTime) {
            this.putQueryParameter("requestTime", requestTime);
            this.requestTime = requestTime;
            return this;
        }

        /**
         * <p>Rule ID</p>
         * 
         * <strong>example:</strong>
         * <p>102059</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>Snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        public Builder ruleSnapshotId(String ruleSnapshotId) {
            this.putQueryParameter("ruleSnapshotId", ruleSnapshotId);
            this.ruleSnapshotId = ruleSnapshotId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60C97040-D5D5-4906-9522-B9B413730CAA</p>
         */
        public Builder sRequestId(String sRequestId) {
            this.putQueryParameter("sRequestId", sRequestId);
            this.sRequestId = sRequestId;
            return this;
        }

        @Override
        public DescribeRuleHitRequest build() {
            return new DescribeRuleHitRequest(this);
        } 

    } 

}
