// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceResponseBody</p>
 */
public class DescribeServiceResponseBody extends TeaModel {
    @NameInMap("KeySpecs")
    private KeySpecs keySpecs;

    @NameInMap("ProtectionLevels")
    private ProtectionLevels protectionLevels;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceResponseBody(Builder builder) {
        this.keySpecs = builder.keySpecs;
        this.protectionLevels = builder.protectionLevels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return keySpecs
     */
    public KeySpecs getKeySpecs() {
        return this.keySpecs;
    }

    /**
     * @return protectionLevels
     */
    public ProtectionLevels getProtectionLevels() {
        return this.protectionLevels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KeySpecs keySpecs; 
        private ProtectionLevels protectionLevels; 
        private String requestId; 

        /**
         * KeySpecs.
         */
        public Builder keySpecs(KeySpecs keySpecs) {
            this.keySpecs = keySpecs;
            return this;
        }

        /**
         * ProtectionLevels.
         */
        public Builder protectionLevels(ProtectionLevels protectionLevels) {
            this.protectionLevels = protectionLevels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceResponseBody build() {
            return new DescribeServiceResponseBody(this);
        } 

    } 

    public static class SupportedProtectionLevels extends TeaModel {
        @NameInMap("SupportedProtectionLevel")
        private java.util.List < String > supportedProtectionLevel;

        private SupportedProtectionLevels(Builder builder) {
            this.supportedProtectionLevel = builder.supportedProtectionLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedProtectionLevels create() {
            return builder().build();
        }

        /**
         * @return supportedProtectionLevel
         */
        public java.util.List < String > getSupportedProtectionLevel() {
            return this.supportedProtectionLevel;
        }

        public static final class Builder {
            private java.util.List < String > supportedProtectionLevel; 

            /**
             * SupportedProtectionLevel.
             */
            public Builder supportedProtectionLevel(java.util.List < String > supportedProtectionLevel) {
                this.supportedProtectionLevel = supportedProtectionLevel;
                return this;
            }

            public SupportedProtectionLevels build() {
                return new SupportedProtectionLevels(this);
            } 

        } 

    }
    public static class Usages extends TeaModel {
        @NameInMap("Usage")
        private java.util.List < String > usage;

        private Usages(Builder builder) {
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usages create() {
            return builder().build();
        }

        /**
         * @return usage
         */
        public java.util.List < String > getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List < String > usage; 

            /**
             * Usage.
             */
            public Builder usage(java.util.List < String > usage) {
                this.usage = usage;
                return this;
            }

            public Usages build() {
                return new Usages(this);
            } 

        } 

    }
    public static class KeySpec extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("SupportedProtectionLevels")
        private SupportedProtectionLevels supportedProtectionLevels;

        @NameInMap("Usages")
        private Usages usages;

        private KeySpec(Builder builder) {
            this.name = builder.name;
            this.supportedProtectionLevels = builder.supportedProtectionLevels;
            this.usages = builder.usages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeySpec create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return supportedProtectionLevels
         */
        public SupportedProtectionLevels getSupportedProtectionLevels() {
            return this.supportedProtectionLevels;
        }

        /**
         * @return usages
         */
        public Usages getUsages() {
            return this.usages;
        }

        public static final class Builder {
            private String name; 
            private SupportedProtectionLevels supportedProtectionLevels; 
            private Usages usages; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SupportedProtectionLevels.
             */
            public Builder supportedProtectionLevels(SupportedProtectionLevels supportedProtectionLevels) {
                this.supportedProtectionLevels = supportedProtectionLevels;
                return this;
            }

            /**
             * Usages.
             */
            public Builder usages(Usages usages) {
                this.usages = usages;
                return this;
            }

            public KeySpec build() {
                return new KeySpec(this);
            } 

        } 

    }
    public static class KeySpecs extends TeaModel {
        @NameInMap("KeySpec")
        private java.util.List < KeySpec> keySpec;

        private KeySpecs(Builder builder) {
            this.keySpec = builder.keySpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeySpecs create() {
            return builder().build();
        }

        /**
         * @return keySpec
         */
        public java.util.List < KeySpec> getKeySpec() {
            return this.keySpec;
        }

        public static final class Builder {
            private java.util.List < KeySpec> keySpec; 

            /**
             * KeySpec.
             */
            public Builder keySpec(java.util.List < KeySpec> keySpec) {
                this.keySpec = keySpec;
                return this;
            }

            public KeySpecs build() {
                return new KeySpecs(this);
            } 

        } 

    }
    public static class ProtectionLevel extends TeaModel {
        @NameInMap("Type")
        private String type;

        private ProtectionLevel(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtectionLevel create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProtectionLevel build() {
                return new ProtectionLevel(this);
            } 

        } 

    }
    public static class ProtectionLevels extends TeaModel {
        @NameInMap("ProtectionLevel")
        private java.util.List < ProtectionLevel> protectionLevel;

        private ProtectionLevels(Builder builder) {
            this.protectionLevel = builder.protectionLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtectionLevels create() {
            return builder().build();
        }

        /**
         * @return protectionLevel
         */
        public java.util.List < ProtectionLevel> getProtectionLevel() {
            return this.protectionLevel;
        }

        public static final class Builder {
            private java.util.List < ProtectionLevel> protectionLevel; 

            /**
             * ProtectionLevel.
             */
            public Builder protectionLevel(java.util.List < ProtectionLevel> protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            public ProtectionLevels build() {
                return new ProtectionLevels(this);
            } 

        } 

    }
}
