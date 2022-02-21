// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewGtmRecoveryPlanResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewGtmRecoveryPlanResponseBody</p>
 */
public class PreviewGtmRecoveryPlanResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Previews")
    private Previews previews;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Previews.
         */
        public Builder previews(Previews previews) {
            this.previews = previews;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public PreviewGtmRecoveryPlanResponseBody build() {
            return new PreviewGtmRecoveryPlanResponseBody(this);
        } 

    } 

    public static class SwitchInfo extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("StrategyName")
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * StrategyName.
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
    public static class SwitchInfos extends TeaModel {
        @NameInMap("SwitchInfo")
        private java.util.List < SwitchInfo> switchInfo;

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
        public java.util.List < SwitchInfo> getSwitchInfo() {
            return this.switchInfo;
        }

        public static final class Builder {
            private java.util.List < SwitchInfo> switchInfo; 

            /**
             * SwitchInfo.
             */
            public Builder switchInfo(java.util.List < SwitchInfo> switchInfo) {
                this.switchInfo = switchInfo;
                return this;
            }

            public SwitchInfos build() {
                return new SwitchInfos(this);
            } 

        } 

    }
    public static class Preview extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("SwitchInfos")
        private SwitchInfos switchInfos;

        @NameInMap("UserDomainName")
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SwitchInfos.
             */
            public Builder switchInfos(SwitchInfos switchInfos) {
                this.switchInfos = switchInfos;
                return this;
            }

            /**
             * UserDomainName.
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
    public static class Previews extends TeaModel {
        @NameInMap("Preview")
        private java.util.List < Preview> preview;

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
        public java.util.List < Preview> getPreview() {
            return this.preview;
        }

        public static final class Builder {
            private java.util.List < Preview> preview; 

            /**
             * Preview.
             */
            public Builder preview(java.util.List < Preview> preview) {
                this.preview = preview;
                return this;
            }

            public Previews build() {
                return new Previews(this);
            } 

        } 

    }
}
