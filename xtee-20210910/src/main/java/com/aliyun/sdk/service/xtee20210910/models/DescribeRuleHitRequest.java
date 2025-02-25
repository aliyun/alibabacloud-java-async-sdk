// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
            this.ruleId = request.ruleId;
            this.ruleSnapshotId = request.ruleSnapshotId;
            this.sRequestId = request.sRequestId;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * ruleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * ruleSnapshotId.
         */
        public Builder ruleSnapshotId(String ruleSnapshotId) {
            this.putQueryParameter("ruleSnapshotId", ruleSnapshotId);
            this.ruleSnapshotId = ruleSnapshotId;
            return this;
        }

        /**
         * sRequestId.
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
