// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link LifecycleRule} extends {@link TeaModel}
 *
 * <p>LifecycleRule</p>
 */
public class LifecycleRule extends TeaModel {
    @NameInMap("AbortMultipartUpload")
    private LifecycleAbortMultipartUpload lifecycleAbortMultipartUpload;

    @NameInMap("Expiration")
    private LifecycleExpiration lifecycleExpiration;

    @NameInMap("ID")
    @Validation(required = true)
    private String id;

    @NameInMap("NoncurrentVersionExpiration")
    private NoncurrentVersionExpiration noncurrentVersionExpiration;

    @NameInMap("NoncurrentVersionTransition")
    private java.util.List < NoncurrentVersionTransition> noncurrentVersionTransition;

    @NameInMap("Prefix")
    private String prefix;

    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @NameInMap("Transition")
    private java.util.List < LifecycleTransition> lifecycleTransition;

    private LifecycleRule(Builder builder) {
        this.lifecycleAbortMultipartUpload = builder.lifecycleAbortMultipartUpload;
        this.lifecycleExpiration = builder.lifecycleExpiration;
        this.id = builder.id;
        this.noncurrentVersionExpiration = builder.noncurrentVersionExpiration;
        this.noncurrentVersionTransition = builder.noncurrentVersionTransition;
        this.prefix = builder.prefix;
        this.status = builder.status;
        this.tag = builder.tag;
        this.lifecycleTransition = builder.lifecycleTransition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LifecycleRule create() {
        return builder().build();
    }

    /**
     * @return lifecycleAbortMultipartUpload
     */
    public LifecycleAbortMultipartUpload getLifecycleAbortMultipartUpload() {
        return this.lifecycleAbortMultipartUpload;
    }

    /**
     * @return lifecycleExpiration
     */
    public LifecycleExpiration getLifecycleExpiration() {
        return this.lifecycleExpiration;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return noncurrentVersionExpiration
     */
    public NoncurrentVersionExpiration getNoncurrentVersionExpiration() {
        return this.noncurrentVersionExpiration;
    }

    /**
     * @return noncurrentVersionTransition
     */
    public java.util.List < NoncurrentVersionTransition> getNoncurrentVersionTransition() {
        return this.noncurrentVersionTransition;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return lifecycleTransition
     */
    public java.util.List < LifecycleTransition> getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    public static final class Builder {
        private LifecycleAbortMultipartUpload lifecycleAbortMultipartUpload; 
        private LifecycleExpiration lifecycleExpiration; 
        private String id; 
        private NoncurrentVersionExpiration noncurrentVersionExpiration; 
        private java.util.List < NoncurrentVersionTransition> noncurrentVersionTransition; 
        private String prefix; 
        private String status; 
        private java.util.List < Tag> tag; 
        private java.util.List < LifecycleTransition> lifecycleTransition; 

        /**
         * 未完成分片上传的过期属性
         */
        public Builder lifecycleAbortMultipartUpload(LifecycleAbortMultipartUpload lifecycleAbortMultipartUpload) {
            this.lifecycleAbortMultipartUpload = lifecycleAbortMultipartUpload;
            return this;
        }

        /**
         * 过期属性
         */
        public Builder lifecycleExpiration(LifecycleExpiration lifecycleExpiration) {
            this.lifecycleExpiration = lifecycleExpiration;
            return this;
        }

        /**
         * 规则标识
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 非当前版本生命周期规则的过期属性
         */
        public Builder noncurrentVersionExpiration(NoncurrentVersionExpiration noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }

        /**
         * 非当前版本生命周期规则的转储属性
         */
        public Builder noncurrentVersionTransition(java.util.List < NoncurrentVersionTransition> noncurrentVersionTransition) {
            this.noncurrentVersionTransition = noncurrentVersionTransition;
            return this;
        }

        /**
         * 指定规则所适用的前缀
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * 规则的状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 标签列表
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.tag = tag;
            return this;
        }

        /**
         * 存储类型转换
         */
        public Builder lifecycleTransition(java.util.List < LifecycleTransition> lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }

        public LifecycleRule build() {
            return new LifecycleRule(this);
        } 

    } 

    public static class LifecycleAbortMultipartUpload extends TeaModel {
        @NameInMap("CreatedBeforeDate")
        private String createdBeforeDate;

        @NameInMap("Days")
        private Integer days;

        private LifecycleAbortMultipartUpload(Builder builder) {
            this.createdBeforeDate = builder.createdBeforeDate;
            this.days = builder.days;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleAbortMultipartUpload create() {
            return builder().build();
        }

        /**
         * @return createdBeforeDate
         */
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        /**
         * @return days
         */
        public Integer getDays() {
            return this.days;
        }

        public static final class Builder {
            private String createdBeforeDate; 
            private Integer days; 

            /**
             * 日期
             */
            public Builder createdBeforeDate(String createdBeforeDate) {
                this.createdBeforeDate = createdBeforeDate;
                return this;
            }

            /**
             * 天数
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            public LifecycleAbortMultipartUpload build() {
                return new LifecycleAbortMultipartUpload(this);
            } 

        } 

    }
    public static class LifecycleExpiration extends TeaModel {
        @NameInMap("CreatedBeforeDate")
        private String createdBeforeDate;

        @NameInMap("Days")
        private Integer days;

        @NameInMap("ExpiredObjectDeleteMarker")
        private Boolean expiredObjectDeleteMarker;

        private LifecycleExpiration(Builder builder) {
            this.createdBeforeDate = builder.createdBeforeDate;
            this.days = builder.days;
            this.expiredObjectDeleteMarker = builder.expiredObjectDeleteMarker;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleExpiration create() {
            return builder().build();
        }

        /**
         * @return createdBeforeDate
         */
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        /**
         * @return days
         */
        public Integer getDays() {
            return this.days;
        }

        /**
         * @return expiredObjectDeleteMarker
         */
        public Boolean getExpiredObjectDeleteMarker() {
            return this.expiredObjectDeleteMarker;
        }

        public static final class Builder {
            private String createdBeforeDate; 
            private Integer days; 
            private Boolean expiredObjectDeleteMarker; 

            /**
             * 日期
             */
            public Builder createdBeforeDate(String createdBeforeDate) {
                this.createdBeforeDate = createdBeforeDate;
                return this;
            }

            /**
             * 天数
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            /**
             * 自动移除过期删除标记
             */
            public Builder expiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
                this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
                return this;
            }

            public LifecycleExpiration build() {
                return new LifecycleExpiration(this);
            } 

        } 

    }
    public static class NoncurrentVersionExpiration extends TeaModel {
        @NameInMap("NoncurrentDays")
        private Integer noncurrentDays;

        private NoncurrentVersionExpiration(Builder builder) {
            this.noncurrentDays = builder.noncurrentDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoncurrentVersionExpiration create() {
            return builder().build();
        }

        /**
         * @return noncurrentDays
         */
        public Integer getNoncurrentDays() {
            return this.noncurrentDays;
        }

        public static final class Builder {
            private Integer noncurrentDays; 

            /**
             * 天数
             */
            public Builder noncurrentDays(Integer noncurrentDays) {
                this.noncurrentDays = noncurrentDays;
                return this;
            }

            public NoncurrentVersionExpiration build() {
                return new NoncurrentVersionExpiration(this);
            } 

        } 

    }
    public static class NoncurrentVersionTransition extends TeaModel {
        @NameInMap("NoncurrentDays")
        private Integer noncurrentDays;

        @NameInMap("StorageClass")
        private String storageClass;

        private NoncurrentVersionTransition(Builder builder) {
            this.noncurrentDays = builder.noncurrentDays;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoncurrentVersionTransition create() {
            return builder().build();
        }

        /**
         * @return noncurrentDays
         */
        public Integer getNoncurrentDays() {
            return this.noncurrentDays;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private Integer noncurrentDays; 
            private String storageClass; 

            /**
             * 天数
             */
            public Builder noncurrentDays(Integer noncurrentDays) {
                this.noncurrentDays = noncurrentDays;
                return this;
            }

            /**
             * 存储类型
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * 存储类型
             */
            public Builder storageClass(StorageClass storageClass) {
                this.storageClass = storageClass.getValue();
                return this;
            }

            public NoncurrentVersionTransition build() {
                return new NoncurrentVersionTransition(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 标签 key
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签 value
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class LifecycleTransition extends TeaModel {
        @NameInMap("CreatedBeforeDate")
        private String createdBeforeDate;

        @NameInMap("Days")
        private Integer days;

        @NameInMap("StorageClass")
        private String storageClass;

        private LifecycleTransition(Builder builder) {
            this.createdBeforeDate = builder.createdBeforeDate;
            this.days = builder.days;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleTransition create() {
            return builder().build();
        }

        /**
         * @return createdBeforeDate
         */
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        /**
         * @return days
         */
        public Integer getDays() {
            return this.days;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private String createdBeforeDate; 
            private Integer days; 
            private String storageClass; 

            /**
             * 日期
             */
            public Builder createdBeforeDate(String createdBeforeDate) {
                this.createdBeforeDate = createdBeforeDate;
                return this;
            }

            /**
             * 天数
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            /**
             * 存储类型
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * 存储类型
             */
            public Builder storageClass(StorageClass storageClass) {
                this.storageClass = storageClass.getValue();
                return this;
            }

            public LifecycleTransition build() {
                return new LifecycleTransition(this);
            } 

        } 

    }
}
