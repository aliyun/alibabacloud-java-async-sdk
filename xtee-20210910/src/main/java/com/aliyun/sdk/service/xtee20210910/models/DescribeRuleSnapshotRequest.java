// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DescribeRuleSnapshotRequest</p>
 */
public class DescribeRuleSnapshotRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("snapshotVersion")
    private String snapshotVersion;

    private DescribeRuleSnapshotRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.ruleId = builder.ruleId;
        this.snapshotVersion = builder.snapshotVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleSnapshotRequest create() {
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
     * @return snapshotVersion
     */
    public String getSnapshotVersion() {
        return this.snapshotVersion;
    }

    public static final class Builder extends Request.Builder<DescribeRuleSnapshotRequest, Builder> {
        private String lang; 
        private String regId; 
        private String ruleId; 
        private String snapshotVersion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRuleSnapshotRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.ruleId = request.ruleId;
            this.snapshotVersion = request.snapshotVersion;
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
         * snapshotVersion.
         */
        public Builder snapshotVersion(String snapshotVersion) {
            this.putQueryParameter("snapshotVersion", snapshotVersion);
            this.snapshotVersion = snapshotVersion;
            return this;
        }

        @Override
        public DescribeRuleSnapshotRequest build() {
            return new DescribeRuleSnapshotRequest(this);
        } 

    } 

}
