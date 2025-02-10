// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link PreviewGtmRecoveryPlanResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewGtmRecoveryPlanResponseBody</p>
 */
public class PreviewGtmRecoveryPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Previews")
    private Previews previews;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private PreviewGtmRecoveryPlanResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.previews = builder.previews;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewGtmRecoveryPlanResponseBody create() {
        return builder().build();
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
     * @return previews
     */
    public Previews getPreviews() {
        return this.previews;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private Previews previews; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The returned preview information of the disaster recovery plan.</p>
         */
        public Builder previews(Previews previews) {
            this.previews = previews;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>853805EA-3D47-47D5-9A1A-A45C24313ABD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned on all pages.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public PreviewGtmRecoveryPlanResponseBody build() {
            return new PreviewGtmRecoveryPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewGtmRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewGtmRecoveryPlanResponseBody</p>
     */
    public static class SwitchInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        private SwitchInfo(Builder builder) {
            this.content = builder.content;
            this.strategyName = builder.strategyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        public static final class Builder {
            private String content; 
            private String strategyName; 

            /**
             * <p>The formatted message content.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The name of the switching policy for address pools.</p>
             * 
             * <strong>example:</strong>
             * <p>strategy-name-example-1</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            public SwitchInfo build() {
                return new SwitchInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewGtmRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewGtmRecoveryPlanResponseBody</p>
     */
    public static class SwitchInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SwitchInfo")
        private java.util.List<SwitchInfo> switchInfo;

        private SwitchInfos(Builder builder) {
            this.switchInfo = builder.switchInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchInfos create() {
            return builder().build();
        }

        /**
         * @return switchInfo
         */
        public java.util.List<SwitchInfo> getSwitchInfo() {
            return this.switchInfo;
        }

        public static final class Builder {
            private java.util.List<SwitchInfo> switchInfo; 

            /**
             * SwitchInfo.
             */
            public Builder switchInfo(java.util.List<SwitchInfo> switchInfo) {
                this.switchInfo = switchInfo;
                return this;
            }

            public SwitchInfos build() {
                return new SwitchInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewGtmRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewGtmRecoveryPlanResponseBody</p>
     */
    public static class Preview extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SwitchInfos")
        private SwitchInfos switchInfos;

        @com.aliyun.core.annotation.NameInMap("UserDomainName")
        private String userDomainName;

        private Preview(Builder builder) {
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.switchInfos = builder.switchInfos;
            this.userDomainName = builder.userDomainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Preview create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return switchInfos
         */
        public SwitchInfos getSwitchInfos() {
            return this.switchInfos;
        }

        /**
         * @return userDomainName
         */
        public String getUserDomainName() {
            return this.userDomainName;
        }

        public static final class Builder {
            private String instanceId; 
            private String name; 
            private SwitchInfos switchInfos; 
            private String userDomainName; 

            /**
             * <p>The ID of the GTM instance to which the previewed disaster recovery plan belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>instance-example</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the GTM instance to which the previewed disaster recovery plan belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>name-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The returned information of the switching policies for address pools.</p>
             */
            public Builder switchInfos(SwitchInfos switchInfos) {
                this.switchInfos = switchInfos;
                return this;
            }

            /**
             * <p>The user&quot;s domain name or domain name list.</p>
             * 
             * <strong>example:</strong>
             * <p>30.yyy.com</p>
             */
            public Builder userDomainName(String userDomainName) {
                this.userDomainName = userDomainName;
                return this;
            }

            public Preview build() {
                return new Preview(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewGtmRecoveryPlanResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewGtmRecoveryPlanResponseBody</p>
     */
    public static class Previews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Preview")
        private java.util.List<Preview> preview;

        private Previews(Builder builder) {
            this.preview = builder.preview;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Previews create() {
            return builder().build();
        }

        /**
         * @return preview
         */
        public java.util.List<Preview> getPreview() {
            return this.preview;
        }

        public static final class Builder {
            private java.util.List<Preview> preview; 

            /**
             * Preview.
             */
            public Builder preview(java.util.List<Preview> preview) {
                this.preview = preview;
                return this;
            }

            public Previews build() {
                return new Previews(this);
            } 

        } 

    }
}
