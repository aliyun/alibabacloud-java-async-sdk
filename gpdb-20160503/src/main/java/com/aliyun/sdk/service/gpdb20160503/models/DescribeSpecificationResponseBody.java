// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpecificationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpecificationResponseBody</p>
 */
public class DescribeSpecificationResponseBody extends TeaModel {
    @NameInMap("DBInstanceClass")
    private java.util.List < DBInstanceClass> DBInstanceClass;

    @NameInMap("DBInstanceGroupCount")
    private java.util.List < DBInstanceGroupCount> DBInstanceGroupCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageNotice")
    private java.util.List < StorageNotice> storageNotice;

    private DescribeSpecificationResponseBody(Builder builder) {
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
        this.requestId = builder.requestId;
        this.storageNotice = builder.storageNotice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpecificationResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceClass
     */
    public java.util.List < DBInstanceClass> getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceGroupCount
     */
    public java.util.List < DBInstanceGroupCount> getDBInstanceGroupCount() {
        return this.DBInstanceGroupCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageNotice
     */
    public java.util.List < StorageNotice> getStorageNotice() {
        return this.storageNotice;
    }

    public static final class Builder {
        private java.util.List < DBInstanceClass> DBInstanceClass; 
        private java.util.List < DBInstanceGroupCount> DBInstanceGroupCount; 
        private String requestId; 
        private java.util.List < StorageNotice> storageNotice; 

        /**
         * DBInstanceClass.
         */
        public Builder DBInstanceClass(java.util.List < DBInstanceClass> DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * DBInstanceGroupCount.
         */
        public Builder DBInstanceGroupCount(java.util.List < DBInstanceGroupCount> DBInstanceGroupCount) {
            this.DBInstanceGroupCount = DBInstanceGroupCount;
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
         * StorageNotice.
         */
        public Builder storageNotice(java.util.List < StorageNotice> storageNotice) {
            this.storageNotice = storageNotice;
            return this;
        }

        public DescribeSpecificationResponseBody build() {
            return new DescribeSpecificationResponseBody(this);
        } 

    } 

    public static class DBInstanceClass extends TeaModel {
        @NameInMap("Text")
        private String text;

        @NameInMap("Value")
        private String value;

        private DBInstanceClass(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceClass create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String text; 
            private String value; 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DBInstanceClass build() {
                return new DBInstanceClass(this);
            } 

        } 

    }
    public static class DBInstanceGroupCount extends TeaModel {
        @NameInMap("Text")
        private String text;

        @NameInMap("Value")
        private String value;

        private DBInstanceGroupCount(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceGroupCount create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String text; 
            private String value; 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DBInstanceGroupCount build() {
                return new DBInstanceGroupCount(this);
            } 

        } 

    }
    public static class StorageNotice extends TeaModel {
        @NameInMap("Text")
        private String text;

        @NameInMap("Value")
        private String value;

        private StorageNotice(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageNotice create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String text; 
            private String value; 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public StorageNotice build() {
                return new StorageNotice(this);
            } 

        } 

    }
}
