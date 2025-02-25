// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
 */
public class DescribeRdsAnalysisResourceQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBNodeCategoryList")
    private DBNodeCategoryList DBNodeCategoryList;

    @com.aliyun.core.annotation.NameInMap("DBNodeClassList")
    private DBNodeClassList DBNodeClassList;

    @com.aliyun.core.annotation.NameInMap("DBNodeStorageList")
    private DBNodeStorageList DBNodeStorageList;

    @com.aliyun.core.annotation.NameInMap("EngineVersionList")
    private EngineVersionList engineVersionList;

    @com.aliyun.core.annotation.NameInMap("ModeList")
    private ModeList modeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageTypeList")
    private StorageTypeList storageTypeList;

    private DescribeRdsAnalysisResourceQuotasResponseBody(Builder builder) {
        this.DBNodeCategoryList = builder.DBNodeCategoryList;
        this.DBNodeClassList = builder.DBNodeClassList;
        this.DBNodeStorageList = builder.DBNodeStorageList;
        this.engineVersionList = builder.engineVersionList;
        this.modeList = builder.modeList;
        this.requestId = builder.requestId;
        this.storageTypeList = builder.storageTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsAnalysisResourceQuotasResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBNodeCategoryList
     */
    public DBNodeCategoryList getDBNodeCategoryList() {
        return this.DBNodeCategoryList;
    }

    /**
     * @return DBNodeClassList
     */
    public DBNodeClassList getDBNodeClassList() {
        return this.DBNodeClassList;
    }

    /**
     * @return DBNodeStorageList
     */
    public DBNodeStorageList getDBNodeStorageList() {
        return this.DBNodeStorageList;
    }

    /**
     * @return engineVersionList
     */
    public EngineVersionList getEngineVersionList() {
        return this.engineVersionList;
    }

    /**
     * @return modeList
     */
    public ModeList getModeList() {
        return this.modeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageTypeList
     */
    public StorageTypeList getStorageTypeList() {
        return this.storageTypeList;
    }

    public static final class Builder {
        private DBNodeCategoryList DBNodeCategoryList; 
        private DBNodeClassList DBNodeClassList; 
        private DBNodeStorageList DBNodeStorageList; 
        private EngineVersionList engineVersionList; 
        private ModeList modeList; 
        private String requestId; 
        private StorageTypeList storageTypeList; 

        /**
         * DBNodeCategoryList.
         */
        public Builder DBNodeCategoryList(DBNodeCategoryList DBNodeCategoryList) {
            this.DBNodeCategoryList = DBNodeCategoryList;
            return this;
        }

        /**
         * DBNodeClassList.
         */
        public Builder DBNodeClassList(DBNodeClassList DBNodeClassList) {
            this.DBNodeClassList = DBNodeClassList;
            return this;
        }

        /**
         * DBNodeStorageList.
         */
        public Builder DBNodeStorageList(DBNodeStorageList DBNodeStorageList) {
            this.DBNodeStorageList = DBNodeStorageList;
            return this;
        }

        /**
         * EngineVersionList.
         */
        public Builder engineVersionList(EngineVersionList engineVersionList) {
            this.engineVersionList = engineVersionList;
            return this;
        }

        /**
         * ModeList.
         */
        public Builder modeList(ModeList modeList) {
            this.modeList = modeList;
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
         * StorageTypeList.
         */
        public Builder storageTypeList(StorageTypeList storageTypeList) {
            this.storageTypeList = storageTypeList;
            return this;
        }

        public DescribeRdsAnalysisResourceQuotasResponseBody build() {
            return new DescribeRdsAnalysisResourceQuotasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class DBNodeCategory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DBNodeCategory(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeCategory create() {
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

            public DBNodeCategory build() {
                return new DBNodeCategory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class DBNodeCategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeCategory")
        private java.util.List < DBNodeCategory> DBNodeCategory;

        private DBNodeCategoryList(Builder builder) {
            this.DBNodeCategory = builder.DBNodeCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeCategoryList create() {
            return builder().build();
        }

        /**
         * @return DBNodeCategory
         */
        public java.util.List < DBNodeCategory> getDBNodeCategory() {
            return this.DBNodeCategory;
        }

        public static final class Builder {
            private java.util.List < DBNodeCategory> DBNodeCategory; 

            /**
             * DBNodeCategory.
             */
            public Builder DBNodeCategory(java.util.List < DBNodeCategory> DBNodeCategory) {
                this.DBNodeCategory = DBNodeCategory;
                return this;
            }

            public DBNodeCategoryList build() {
                return new DBNodeCategoryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class DBNodeClass extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DBNodeClass(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeClass create() {
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

            public DBNodeClass build() {
                return new DBNodeClass(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class DBNodeClassList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private java.util.List < DBNodeClass> DBNodeClass;

        private DBNodeClassList(Builder builder) {
            this.DBNodeClass = builder.DBNodeClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeClassList create() {
            return builder().build();
        }

        /**
         * @return DBNodeClass
         */
        public java.util.List < DBNodeClass> getDBNodeClass() {
            return this.DBNodeClass;
        }

        public static final class Builder {
            private java.util.List < DBNodeClass> DBNodeClass; 

            /**
             * DBNodeClass.
             */
            public Builder DBNodeClass(java.util.List < DBNodeClass> DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            public DBNodeClassList build() {
                return new DBNodeClassList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class DBNodeStorage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DBNodeStorage(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeStorage create() {
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

            public DBNodeStorage build() {
                return new DBNodeStorage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class DBNodeStorageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeStorage")
        private java.util.List < DBNodeStorage> DBNodeStorage;

        private DBNodeStorageList(Builder builder) {
            this.DBNodeStorage = builder.DBNodeStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeStorageList create() {
            return builder().build();
        }

        /**
         * @return DBNodeStorage
         */
        public java.util.List < DBNodeStorage> getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public static final class Builder {
            private java.util.List < DBNodeStorage> DBNodeStorage; 

            /**
             * DBNodeStorage.
             */
            public Builder DBNodeStorage(java.util.List < DBNodeStorage> DBNodeStorage) {
                this.DBNodeStorage = DBNodeStorage;
                return this;
            }

            public DBNodeStorageList build() {
                return new DBNodeStorageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class EngineVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EngineVersion(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineVersion create() {
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

            public EngineVersion build() {
                return new EngineVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class EngineVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private java.util.List < EngineVersion> engineVersion;

        private EngineVersionList(Builder builder) {
            this.engineVersion = builder.engineVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineVersionList create() {
            return builder().build();
        }

        /**
         * @return engineVersion
         */
        public java.util.List < EngineVersion> getEngineVersion() {
            return this.engineVersion;
        }

        public static final class Builder {
            private java.util.List < EngineVersion> engineVersion; 

            /**
             * EngineVersion.
             */
            public Builder engineVersion(java.util.List < EngineVersion> engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            public EngineVersionList build() {
                return new EngineVersionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class Mode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Mode(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mode create() {
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

            public Mode build() {
                return new Mode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class ModeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private java.util.List < Mode> mode;

        private ModeList(Builder builder) {
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModeList create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public java.util.List < Mode> getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List < Mode> mode; 

            /**
             * Mode.
             */
            public Builder mode(java.util.List < Mode> mode) {
                this.mode = mode;
                return this;
            }

            public ModeList build() {
                return new ModeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class StorageType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private StorageType(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageType create() {
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

            public StorageType build() {
                return new StorageType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsAnalysisResourceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsAnalysisResourceQuotasResponseBody</p>
     */
    public static class StorageTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageType")
        private java.util.List < StorageType> storageType;

        private StorageTypeList(Builder builder) {
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageTypeList create() {
            return builder().build();
        }

        /**
         * @return storageType
         */
        public java.util.List < StorageType> getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private java.util.List < StorageType> storageType; 

            /**
             * StorageType.
             */
            public Builder storageType(java.util.List < StorageType> storageType) {
                this.storageType = storageType;
                return this;
            }

            public StorageTypeList build() {
                return new StorageTypeList(this);
            } 

        } 

    }
}
