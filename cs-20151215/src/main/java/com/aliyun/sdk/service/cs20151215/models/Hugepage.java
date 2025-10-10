// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link Hugepage} extends {@link TeaModel}
 *
 * <p>Hugepage</p>
 */
public class Hugepage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("khugepagedAllocSleepMillisecs")
    private Long khugepagedAllocSleepMillisecs;

    @com.aliyun.core.annotation.NameInMap("khugepagedDefrag")
    private Long khugepagedDefrag;

    @com.aliyun.core.annotation.NameInMap("khugepagedPagesToScan")
    private Long khugepagedPagesToScan;

    @com.aliyun.core.annotation.NameInMap("khugepagedScanSleepMillisecs")
    private Long khugepagedScanSleepMillisecs;

    @com.aliyun.core.annotation.NameInMap("transparentDefrag")
    private String transparentDefrag;

    @com.aliyun.core.annotation.NameInMap("transparentEnabled")
    private String transparentEnabled;

    private Hugepage(Builder builder) {
        this.khugepagedAllocSleepMillisecs = builder.khugepagedAllocSleepMillisecs;
        this.khugepagedDefrag = builder.khugepagedDefrag;
        this.khugepagedPagesToScan = builder.khugepagedPagesToScan;
        this.khugepagedScanSleepMillisecs = builder.khugepagedScanSleepMillisecs;
        this.transparentDefrag = builder.transparentDefrag;
        this.transparentEnabled = builder.transparentEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Hugepage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return khugepagedAllocSleepMillisecs
     */
    public Long getKhugepagedAllocSleepMillisecs() {
        return this.khugepagedAllocSleepMillisecs;
    }

    /**
     * @return khugepagedDefrag
     */
    public Long getKhugepagedDefrag() {
        return this.khugepagedDefrag;
    }

    /**
     * @return khugepagedPagesToScan
     */
    public Long getKhugepagedPagesToScan() {
        return this.khugepagedPagesToScan;
    }

    /**
     * @return khugepagedScanSleepMillisecs
     */
    public Long getKhugepagedScanSleepMillisecs() {
        return this.khugepagedScanSleepMillisecs;
    }

    /**
     * @return transparentDefrag
     */
    public String getTransparentDefrag() {
        return this.transparentDefrag;
    }

    /**
     * @return transparentEnabled
     */
    public String getTransparentEnabled() {
        return this.transparentEnabled;
    }

    public static final class Builder {
        private Long khugepagedAllocSleepMillisecs; 
        private Long khugepagedDefrag; 
        private Long khugepagedPagesToScan; 
        private Long khugepagedScanSleepMillisecs; 
        private String transparentDefrag; 
        private String transparentEnabled; 

        private Builder() {
        } 

        private Builder(Hugepage model) {
            this.khugepagedAllocSleepMillisecs = model.khugepagedAllocSleepMillisecs;
            this.khugepagedDefrag = model.khugepagedDefrag;
            this.khugepagedPagesToScan = model.khugepagedPagesToScan;
            this.khugepagedScanSleepMillisecs = model.khugepagedScanSleepMillisecs;
            this.transparentDefrag = model.transparentDefrag;
            this.transparentEnabled = model.transparentEnabled;
        } 

        /**
         * khugepagedAllocSleepMillisecs.
         */
        public Builder khugepagedAllocSleepMillisecs(Long khugepagedAllocSleepMillisecs) {
            this.khugepagedAllocSleepMillisecs = khugepagedAllocSleepMillisecs;
            return this;
        }

        /**
         * khugepagedDefrag.
         */
        public Builder khugepagedDefrag(Long khugepagedDefrag) {
            this.khugepagedDefrag = khugepagedDefrag;
            return this;
        }

        /**
         * khugepagedPagesToScan.
         */
        public Builder khugepagedPagesToScan(Long khugepagedPagesToScan) {
            this.khugepagedPagesToScan = khugepagedPagesToScan;
            return this;
        }

        /**
         * khugepagedScanSleepMillisecs.
         */
        public Builder khugepagedScanSleepMillisecs(Long khugepagedScanSleepMillisecs) {
            this.khugepagedScanSleepMillisecs = khugepagedScanSleepMillisecs;
            return this;
        }

        /**
         * transparentDefrag.
         */
        public Builder transparentDefrag(String transparentDefrag) {
            this.transparentDefrag = transparentDefrag;
            return this;
        }

        /**
         * transparentEnabled.
         */
        public Builder transparentEnabled(String transparentEnabled) {
            this.transparentEnabled = transparentEnabled;
            return this;
        }

        public Hugepage build() {
            return new Hugepage(this);
        } 

    } 

}
