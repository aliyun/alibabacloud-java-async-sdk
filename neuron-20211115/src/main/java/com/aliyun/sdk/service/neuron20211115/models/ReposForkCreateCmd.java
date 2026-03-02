// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ReposForkCreateCmd} extends {@link TeaModel}
 *
 * <p>ReposForkCreateCmd</p>
 */
public class ReposForkCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("gitGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gitGroup;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("usage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String usage;

    @com.aliyun.core.annotation.NameInMap("visible")
    private Boolean visible;

    private ReposForkCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.gitGroup = builder.gitGroup;
        this.marketId = builder.marketId;
        this.pbcId = builder.pbcId;
        this.usage = builder.usage;
        this.visible = builder.visible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReposForkCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return gitGroup
     */
    public String getGitGroup() {
        return this.gitGroup;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    /**
     * @return visible
     */
    public Boolean getVisible() {
        return this.visible;
    }

    public static final class Builder {
        private Long companyId; 
        private String gitGroup; 
        private Long marketId; 
        private Long pbcId; 
        private String usage; 
        private Boolean visible; 

        private Builder() {
        } 

        private Builder(ReposForkCreateCmd model) {
            this.companyId = model.companyId;
            this.gitGroup = model.gitGroup;
            this.marketId = model.marketId;
            this.pbcId = model.pbcId;
            this.usage = model.usage;
            this.visible = model.visible;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>global-mall</p>
         */
        public Builder gitGroup(String gitGroup) {
            this.gitGroup = gitGroup;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>商城国际化版本</p>
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        /**
         * visible.
         */
        public Builder visible(Boolean visible) {
            this.visible = visible;
            return this;
        }

        public ReposForkCreateCmd build() {
            return new ReposForkCreateCmd(this);
        } 

    } 

}
