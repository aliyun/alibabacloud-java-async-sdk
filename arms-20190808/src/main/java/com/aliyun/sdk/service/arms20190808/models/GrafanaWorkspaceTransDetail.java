// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceTransDetail} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceTransDetail</p>
 */
public class GrafanaWorkspaceTransDetail extends TeaModel {
    @NameInMap("dashboardAmount")
    private Integer dashboardAmount;

    @NameInMap("dataSourceAmount")
    private Integer dataSourceAmount;

    @NameInMap("original")
    private Long original;

    @NameInMap("originalName")
    private String originalName;

    @NameInMap("target")
    private Long target;

    @NameInMap("targetName")
    private String targetName;

    private GrafanaWorkspaceTransDetail(Builder builder) {
        this.dashboardAmount = builder.dashboardAmount;
        this.dataSourceAmount = builder.dataSourceAmount;
        this.original = builder.original;
        this.originalName = builder.originalName;
        this.target = builder.target;
        this.targetName = builder.targetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceTransDetail create() {
        return builder().build();
    }

    /**
     * @return dashboardAmount
     */
    public Integer getDashboardAmount() {
        return this.dashboardAmount;
    }

    /**
     * @return dataSourceAmount
     */
    public Integer getDataSourceAmount() {
        return this.dataSourceAmount;
    }

    /**
     * @return original
     */
    public Long getOriginal() {
        return this.original;
    }

    /**
     * @return originalName
     */
    public String getOriginalName() {
        return this.originalName;
    }

    /**
     * @return target
     */
    public Long getTarget() {
        return this.target;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    public static final class Builder {
        private Integer dashboardAmount; 
        private Integer dataSourceAmount; 
        private Long original; 
        private String originalName; 
        private Long target; 
        private String targetName; 

        /**
         * dashboardAmount.
         */
        public Builder dashboardAmount(Integer dashboardAmount) {
            this.dashboardAmount = dashboardAmount;
            return this;
        }

        /**
         * dataSourceAmount.
         */
        public Builder dataSourceAmount(Integer dataSourceAmount) {
            this.dataSourceAmount = dataSourceAmount;
            return this;
        }

        /**
         * original.
         */
        public Builder original(Long original) {
            this.original = original;
            return this;
        }

        /**
         * originalName.
         */
        public Builder originalName(String originalName) {
            this.originalName = originalName;
            return this;
        }

        /**
         * target.
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * targetName.
         */
        public Builder targetName(String targetName) {
            this.targetName = targetName;
            return this;
        }

        public GrafanaWorkspaceTransDetail build() {
            return new GrafanaWorkspaceTransDetail(this);
        } 

    } 

}
