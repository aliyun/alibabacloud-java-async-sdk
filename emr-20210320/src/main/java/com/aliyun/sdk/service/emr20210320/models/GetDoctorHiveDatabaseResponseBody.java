// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHiveDatabaseResponseBody</p>
 */
public class GetDoctorHiveDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDoctorHiveDatabaseResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHiveDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The analysis results of the Hive database.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorHiveDatabaseResponseBody build() {
            return new GetDoctorHiveDatabaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HiveDistributionScore")
        private Integer hiveDistributionScore;

        @com.aliyun.core.annotation.NameInMap("HiveFormatScore")
        private Integer hiveFormatScore;

        @com.aliyun.core.annotation.NameInMap("HiveFrequencyScore")
        private Integer hiveFrequencyScore;

        @com.aliyun.core.annotation.NameInMap("HiveScore")
        private Integer hiveScore;

        private Analysis(Builder builder) {
            this.hiveDistributionScore = builder.hiveDistributionScore;
            this.hiveFormatScore = builder.hiveFormatScore;
            this.hiveFrequencyScore = builder.hiveFrequencyScore;
            this.hiveScore = builder.hiveScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return hiveDistributionScore
         */
        public Integer getHiveDistributionScore() {
            return this.hiveDistributionScore;
        }

        /**
         * @return hiveFormatScore
         */
        public Integer getHiveFormatScore() {
            return this.hiveFormatScore;
        }

        /**
         * @return hiveFrequencyScore
         */
        public Integer getHiveFrequencyScore() {
            return this.hiveFrequencyScore;
        }

        /**
         * @return hiveScore
         */
        public Integer getHiveScore() {
            return this.hiveScore;
        }

        public static final class Builder {
            private Integer hiveDistributionScore; 
            private Integer hiveFormatScore; 
            private Integer hiveFrequencyScore; 
            private Integer hiveScore; 

            /**
             * <p>The score for the file sizes of the Hive database.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder hiveDistributionScore(Integer hiveDistributionScore) {
                this.hiveDistributionScore = hiveDistributionScore;
                return this;
            }

            /**
             * <p>The score for the data formats of the Hive database.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder hiveFormatScore(Integer hiveFormatScore) {
                this.hiveFormatScore = hiveFormatScore;
                return this;
            }

            /**
             * <p>The score for the access frequency of the Hive database.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder hiveFrequencyScore(Integer hiveFrequencyScore) {
                this.hiveFrequencyScore = hiveFrequencyScore;
                return this;
            }

            /**
             * <p>The overall score of the Hive database.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder hiveScore(Integer hiveScore) {
                this.hiveScore = hiveScore;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class Formats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FormatDayGrowthSize")
        private Long formatDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("FormatName")
        private String formatName;

        @com.aliyun.core.annotation.NameInMap("FormatRatio")
        private Float formatRatio;

        @com.aliyun.core.annotation.NameInMap("FormatSize")
        private Long formatSize;

        @com.aliyun.core.annotation.NameInMap("FormatSizeDayGrowthRatio")
        private Float formatSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("FormatSizeUnit")
        private String formatSizeUnit;

        private Formats(Builder builder) {
            this.formatDayGrowthSize = builder.formatDayGrowthSize;
            this.formatName = builder.formatName;
            this.formatRatio = builder.formatRatio;
            this.formatSize = builder.formatSize;
            this.formatSizeDayGrowthRatio = builder.formatSizeDayGrowthRatio;
            this.formatSizeUnit = builder.formatSizeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Formats create() {
            return builder().build();
        }

        /**
         * @return formatDayGrowthSize
         */
        public Long getFormatDayGrowthSize() {
            return this.formatDayGrowthSize;
        }

        /**
         * @return formatName
         */
        public String getFormatName() {
            return this.formatName;
        }

        /**
         * @return formatRatio
         */
        public Float getFormatRatio() {
            return this.formatRatio;
        }

        /**
         * @return formatSize
         */
        public Long getFormatSize() {
            return this.formatSize;
        }

        /**
         * @return formatSizeDayGrowthRatio
         */
        public Float getFormatSizeDayGrowthRatio() {
            return this.formatSizeDayGrowthRatio;
        }

        /**
         * @return formatSizeUnit
         */
        public String getFormatSizeUnit() {
            return this.formatSizeUnit;
        }

        public static final class Builder {
            private Long formatDayGrowthSize; 
            private String formatName; 
            private Float formatRatio; 
            private Long formatSize; 
            private Float formatSizeDayGrowthRatio; 
            private String formatSizeUnit; 

            /**
             * <p>The daily increment of data in the format.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder formatDayGrowthSize(Long formatDayGrowthSize) {
                this.formatDayGrowthSize = formatDayGrowthSize;
                return this;
            }

            /**
             * <p>The name of the storage format.</p>
             * 
             * <strong>example:</strong>
             * <p>TextInputFormat</p>
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * <p>The proportion of the data in the format.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder formatRatio(Float formatRatio) {
                this.formatRatio = formatRatio;
                return this;
            }

            /**
             * <p>The amount of data in the format.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder formatSize(Long formatSize) {
                this.formatSize = formatSize;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of data in the format.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder formatSizeDayGrowthRatio(Float formatSizeDayGrowthRatio) {
                this.formatSizeDayGrowthRatio = formatSizeDayGrowthRatio;
                return this;
            }

            /**
             * <p>The unit of the amount of data in the format.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder formatSizeUnit(String formatSizeUnit) {
                this.formatSizeUnit = formatSizeUnit;
                return this;
            }

            public Formats build() {
                return new Formats(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class ColdDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private ColdDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataDayGrowthSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth size of cold data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>coldDataDayGrowthSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ColdDataDayGrowthSize build() {
                return new ColdDataDayGrowthSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class ColdDataRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private ColdDataRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Cold data ratio</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>coldDataRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public ColdDataRatio build() {
                return new ColdDataRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class ColdDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private ColdDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of cold files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>coldDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ColdDataSize build() {
                return new ColdDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class ColdDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private ColdDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataSizeDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of cold data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>coldDataSizeDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public ColdDataSizeDayGrowthRatio build() {
                return new ColdDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class EmptyFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private EmptyFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyFileCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of empty files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>emptyFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public EmptyFileCount build() {
                return new EmptyFileCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class EmptyFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private EmptyFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyFileCountDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of empty files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>emptyFileCountDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public EmptyFileCountDayGrowthRatio build() {
                return new EmptyFileCountDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class EmptyFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private EmptyFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyFileDayGrowthCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth count of empty files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>emptyFileDayGrowthCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public EmptyFileDayGrowthCount build() {
                return new EmptyFileDayGrowthCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class EmptyFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private EmptyFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyFileRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of empty files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>emptyFileRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public EmptyFileRatio build() {
                return new EmptyFileRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class FreezeDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private FreezeDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataDayGrowthSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth size of freeze data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>freezeDataDayGrowthSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public FreezeDataDayGrowthSize build() {
                return new FreezeDataDayGrowthSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class FreezeDataRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private FreezeDataRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of freeze data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>freezeDataRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public FreezeDataRatio build() {
                return new FreezeDataRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class FreezeDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private FreezeDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of freeze files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>freezeDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public FreezeDataSize build() {
                return new FreezeDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class FreezeDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private FreezeDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataSizeDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of freeze data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>freezeDataSizeDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public FreezeDataSizeDayGrowthRatio build() {
                return new FreezeDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class HotDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private HotDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataDayGrowthSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth size of hot data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>hotDataDayGrowthSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public HotDataDayGrowthSize build() {
                return new HotDataDayGrowthSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class HotDataRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private HotDataRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Hot data ratio</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>hotDataRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public HotDataRatio build() {
                return new HotDataRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class HotDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private HotDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of hot files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>hotDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public HotDataSize build() {
                return new HotDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class HotDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private HotDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataSizeDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of hot data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>hotDataSizeDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public HotDataSizeDayGrowthRatio build() {
                return new HotDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class LargeFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private LargeFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeFileCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of large files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>largeFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public LargeFileCount build() {
                return new LargeFileCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class LargeFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private LargeFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeFileCountDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of large files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>largeFileCountDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public LargeFileCountDayGrowthRatio build() {
                return new LargeFileCountDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class LargeFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private LargeFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeFileDayGrowthCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth count of large files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>largeFileDayGrowthCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public LargeFileDayGrowthCount build() {
                return new LargeFileDayGrowthCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class LargeFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private LargeFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeFileRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of large files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>largeFileRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public LargeFileRatio build() {
                return new LargeFileRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class MediumFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private MediumFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediumFileCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of medium files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>mediumFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MediumFileCount build() {
                return new MediumFileCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class MediumFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private MediumFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediumFileCountDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of medium files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>mediumFileCountDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MediumFileCountDayGrowthRatio build() {
                return new MediumFileCountDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class MediumFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private MediumFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediumFileDayGrowthCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth count of medium files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>mediumFileDayGrowthCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MediumFileDayGrowthCount build() {
                return new MediumFileDayGrowthCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class MediumFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private MediumFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediumFileRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of medium files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>mediumFileRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MediumFileRatio build() {
                return new MediumFileRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class PartitionNum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private PartitionNum(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartitionNum create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of partitions</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>partitionNum</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public PartitionNum build() {
                return new PartitionNum(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class SmallFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private SmallFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmallFileCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of small files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>smallFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public SmallFileCount build() {
                return new SmallFileCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class SmallFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private SmallFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmallFileCountDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of small files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>smallFileCountDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public SmallFileCountDayGrowthRatio build() {
                return new SmallFileCountDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class SmallFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private SmallFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmallFileDayGrowthCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth count of small files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>smallFileDayGrowthCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public SmallFileDayGrowthCount build() {
                return new SmallFileDayGrowthCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class SmallFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private SmallFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmallFileRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of small files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>smallFileRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public SmallFileRatio build() {
                return new SmallFileRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TableCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TableCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of tables</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>tableCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TableCount build() {
                return new TableCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TinyFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TinyFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TinyFileCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of tiny files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>tinyFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TinyFileCount build() {
                return new TinyFileCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TinyFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TinyFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TinyFileCountDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of tiny files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>tinyFileCountDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TinyFileCountDayGrowthRatio build() {
                return new TinyFileCountDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TinyFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TinyFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TinyFileDayGrowthCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth count of tiny files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>tinyFileDayGrowthCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TinyFileDayGrowthCount build() {
                return new TinyFileDayGrowthCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TinyFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TinyFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TinyFileRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of tiny files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>tinyFileRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TinyFileRatio build() {
                return new TinyFileRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TotalDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDataDayGrowthSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth size of total data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalDataDayGrowthSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalDataDayGrowthSize build() {
                return new TotalDataDayGrowthSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TotalDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDataSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total data size in megabytes (MB)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalDataSize build() {
                return new TotalDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TotalDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TotalDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDataSizeDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of total data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalDataSizeDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TotalDataSizeDayGrowthRatio build() {
                return new TotalDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TotalFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalFileCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of total files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalFileCount build() {
                return new TotalFileCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TotalFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TotalFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalFileCountDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of total files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalFileCountDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TotalFileCountDayGrowthRatio build() {
                return new TotalFileCountDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class TotalFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalFileDayGrowthCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth count of total files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalFileDayGrowthCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalFileDayGrowthCount build() {
                return new TotalFileDayGrowthCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class WarmDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private WarmDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataDayGrowthSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth size of warm data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>warmDataDayGrowthSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public WarmDataDayGrowthSize build() {
                return new WarmDataDayGrowthSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class WarmDataRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private WarmDataRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of warm data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>warmDataRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public WarmDataRatio build() {
                return new WarmDataRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class WarmDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private WarmDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of warm files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>warmDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public WarmDataSize build() {
                return new WarmDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class WarmDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private WarmDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataSizeDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of warm data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>warmDataSizeDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public WarmDataSizeDayGrowthRatio build() {
                return new WarmDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdDataDayGrowthSize")
        private ColdDataDayGrowthSize coldDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("ColdDataRatio")
        private ColdDataRatio coldDataRatio;

        @com.aliyun.core.annotation.NameInMap("ColdDataSize")
        private ColdDataSize coldDataSize;

        @com.aliyun.core.annotation.NameInMap("ColdDataSizeDayGrowthRatio")
        private ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("EmptyFileCount")
        private EmptyFileCount emptyFileCount;

        @com.aliyun.core.annotation.NameInMap("EmptyFileCountDayGrowthRatio")
        private EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("EmptyFileDayGrowthCount")
        private EmptyFileDayGrowthCount emptyFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("EmptyFileRatio")
        private EmptyFileRatio emptyFileRatio;

        @com.aliyun.core.annotation.NameInMap("FreezeDataDayGrowthSize")
        private FreezeDataDayGrowthSize freezeDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("FreezeDataRatio")
        private FreezeDataRatio freezeDataRatio;

        @com.aliyun.core.annotation.NameInMap("FreezeDataSize")
        private FreezeDataSize freezeDataSize;

        @com.aliyun.core.annotation.NameInMap("FreezeDataSizeDayGrowthRatio")
        private FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("HotDataDayGrowthSize")
        private HotDataDayGrowthSize hotDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("HotDataRatio")
        private HotDataRatio hotDataRatio;

        @com.aliyun.core.annotation.NameInMap("HotDataSize")
        private HotDataSize hotDataSize;

        @com.aliyun.core.annotation.NameInMap("HotDataSizeDayGrowthRatio")
        private HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("LargeFileCount")
        private LargeFileCount largeFileCount;

        @com.aliyun.core.annotation.NameInMap("LargeFileCountDayGrowthRatio")
        private LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("LargeFileDayGrowthCount")
        private LargeFileDayGrowthCount largeFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("LargeFileRatio")
        private LargeFileRatio largeFileRatio;

        @com.aliyun.core.annotation.NameInMap("MediumFileCount")
        private MediumFileCount mediumFileCount;

        @com.aliyun.core.annotation.NameInMap("MediumFileCountDayGrowthRatio")
        private MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("MediumFileDayGrowthCount")
        private MediumFileDayGrowthCount mediumFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("MediumFileRatio")
        private MediumFileRatio mediumFileRatio;

        @com.aliyun.core.annotation.NameInMap("PartitionNum")
        private PartitionNum partitionNum;

        @com.aliyun.core.annotation.NameInMap("SmallFileCount")
        private SmallFileCount smallFileCount;

        @com.aliyun.core.annotation.NameInMap("SmallFileCountDayGrowthRatio")
        private SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("SmallFileDayGrowthCount")
        private SmallFileDayGrowthCount smallFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("SmallFileRatio")
        private SmallFileRatio smallFileRatio;

        @com.aliyun.core.annotation.NameInMap("TableCount")
        private TableCount tableCount;

        @com.aliyun.core.annotation.NameInMap("TinyFileCount")
        private TinyFileCount tinyFileCount;

        @com.aliyun.core.annotation.NameInMap("TinyFileCountDayGrowthRatio")
        private TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("TinyFileDayGrowthCount")
        private TinyFileDayGrowthCount tinyFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("TinyFileRatio")
        private TinyFileRatio tinyFileRatio;

        @com.aliyun.core.annotation.NameInMap("TotalDataDayGrowthSize")
        private TotalDataDayGrowthSize totalDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("TotalDataSize")
        private TotalDataSize totalDataSize;

        @com.aliyun.core.annotation.NameInMap("TotalDataSizeDayGrowthRatio")
        private TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("TotalFileCount")
        private TotalFileCount totalFileCount;

        @com.aliyun.core.annotation.NameInMap("TotalFileCountDayGrowthRatio")
        private TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("TotalFileDayGrowthCount")
        private TotalFileDayGrowthCount totalFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("WarmDataDayGrowthSize")
        private WarmDataDayGrowthSize warmDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("WarmDataRatio")
        private WarmDataRatio warmDataRatio;

        @com.aliyun.core.annotation.NameInMap("WarmDataSize")
        private WarmDataSize warmDataSize;

        @com.aliyun.core.annotation.NameInMap("WarmDataSizeDayGrowthRatio")
        private WarmDataSizeDayGrowthRatio warmDataSizeDayGrowthRatio;

        private Metrics(Builder builder) {
            this.coldDataDayGrowthSize = builder.coldDataDayGrowthSize;
            this.coldDataRatio = builder.coldDataRatio;
            this.coldDataSize = builder.coldDataSize;
            this.coldDataSizeDayGrowthRatio = builder.coldDataSizeDayGrowthRatio;
            this.emptyFileCount = builder.emptyFileCount;
            this.emptyFileCountDayGrowthRatio = builder.emptyFileCountDayGrowthRatio;
            this.emptyFileDayGrowthCount = builder.emptyFileDayGrowthCount;
            this.emptyFileRatio = builder.emptyFileRatio;
            this.freezeDataDayGrowthSize = builder.freezeDataDayGrowthSize;
            this.freezeDataRatio = builder.freezeDataRatio;
            this.freezeDataSize = builder.freezeDataSize;
            this.freezeDataSizeDayGrowthRatio = builder.freezeDataSizeDayGrowthRatio;
            this.hotDataDayGrowthSize = builder.hotDataDayGrowthSize;
            this.hotDataRatio = builder.hotDataRatio;
            this.hotDataSize = builder.hotDataSize;
            this.hotDataSizeDayGrowthRatio = builder.hotDataSizeDayGrowthRatio;
            this.largeFileCount = builder.largeFileCount;
            this.largeFileCountDayGrowthRatio = builder.largeFileCountDayGrowthRatio;
            this.largeFileDayGrowthCount = builder.largeFileDayGrowthCount;
            this.largeFileRatio = builder.largeFileRatio;
            this.mediumFileCount = builder.mediumFileCount;
            this.mediumFileCountDayGrowthRatio = builder.mediumFileCountDayGrowthRatio;
            this.mediumFileDayGrowthCount = builder.mediumFileDayGrowthCount;
            this.mediumFileRatio = builder.mediumFileRatio;
            this.partitionNum = builder.partitionNum;
            this.smallFileCount = builder.smallFileCount;
            this.smallFileCountDayGrowthRatio = builder.smallFileCountDayGrowthRatio;
            this.smallFileDayGrowthCount = builder.smallFileDayGrowthCount;
            this.smallFileRatio = builder.smallFileRatio;
            this.tableCount = builder.tableCount;
            this.tinyFileCount = builder.tinyFileCount;
            this.tinyFileCountDayGrowthRatio = builder.tinyFileCountDayGrowthRatio;
            this.tinyFileDayGrowthCount = builder.tinyFileDayGrowthCount;
            this.tinyFileRatio = builder.tinyFileRatio;
            this.totalDataDayGrowthSize = builder.totalDataDayGrowthSize;
            this.totalDataSize = builder.totalDataSize;
            this.totalDataSizeDayGrowthRatio = builder.totalDataSizeDayGrowthRatio;
            this.totalFileCount = builder.totalFileCount;
            this.totalFileCountDayGrowthRatio = builder.totalFileCountDayGrowthRatio;
            this.totalFileDayGrowthCount = builder.totalFileDayGrowthCount;
            this.warmDataDayGrowthSize = builder.warmDataDayGrowthSize;
            this.warmDataRatio = builder.warmDataRatio;
            this.warmDataSize = builder.warmDataSize;
            this.warmDataSizeDayGrowthRatio = builder.warmDataSizeDayGrowthRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return coldDataDayGrowthSize
         */
        public ColdDataDayGrowthSize getColdDataDayGrowthSize() {
            return this.coldDataDayGrowthSize;
        }

        /**
         * @return coldDataRatio
         */
        public ColdDataRatio getColdDataRatio() {
            return this.coldDataRatio;
        }

        /**
         * @return coldDataSize
         */
        public ColdDataSize getColdDataSize() {
            return this.coldDataSize;
        }

        /**
         * @return coldDataSizeDayGrowthRatio
         */
        public ColdDataSizeDayGrowthRatio getColdDataSizeDayGrowthRatio() {
            return this.coldDataSizeDayGrowthRatio;
        }

        /**
         * @return emptyFileCount
         */
        public EmptyFileCount getEmptyFileCount() {
            return this.emptyFileCount;
        }

        /**
         * @return emptyFileCountDayGrowthRatio
         */
        public EmptyFileCountDayGrowthRatio getEmptyFileCountDayGrowthRatio() {
            return this.emptyFileCountDayGrowthRatio;
        }

        /**
         * @return emptyFileDayGrowthCount
         */
        public EmptyFileDayGrowthCount getEmptyFileDayGrowthCount() {
            return this.emptyFileDayGrowthCount;
        }

        /**
         * @return emptyFileRatio
         */
        public EmptyFileRatio getEmptyFileRatio() {
            return this.emptyFileRatio;
        }

        /**
         * @return freezeDataDayGrowthSize
         */
        public FreezeDataDayGrowthSize getFreezeDataDayGrowthSize() {
            return this.freezeDataDayGrowthSize;
        }

        /**
         * @return freezeDataRatio
         */
        public FreezeDataRatio getFreezeDataRatio() {
            return this.freezeDataRatio;
        }

        /**
         * @return freezeDataSize
         */
        public FreezeDataSize getFreezeDataSize() {
            return this.freezeDataSize;
        }

        /**
         * @return freezeDataSizeDayGrowthRatio
         */
        public FreezeDataSizeDayGrowthRatio getFreezeDataSizeDayGrowthRatio() {
            return this.freezeDataSizeDayGrowthRatio;
        }

        /**
         * @return hotDataDayGrowthSize
         */
        public HotDataDayGrowthSize getHotDataDayGrowthSize() {
            return this.hotDataDayGrowthSize;
        }

        /**
         * @return hotDataRatio
         */
        public HotDataRatio getHotDataRatio() {
            return this.hotDataRatio;
        }

        /**
         * @return hotDataSize
         */
        public HotDataSize getHotDataSize() {
            return this.hotDataSize;
        }

        /**
         * @return hotDataSizeDayGrowthRatio
         */
        public HotDataSizeDayGrowthRatio getHotDataSizeDayGrowthRatio() {
            return this.hotDataSizeDayGrowthRatio;
        }

        /**
         * @return largeFileCount
         */
        public LargeFileCount getLargeFileCount() {
            return this.largeFileCount;
        }

        /**
         * @return largeFileCountDayGrowthRatio
         */
        public LargeFileCountDayGrowthRatio getLargeFileCountDayGrowthRatio() {
            return this.largeFileCountDayGrowthRatio;
        }

        /**
         * @return largeFileDayGrowthCount
         */
        public LargeFileDayGrowthCount getLargeFileDayGrowthCount() {
            return this.largeFileDayGrowthCount;
        }

        /**
         * @return largeFileRatio
         */
        public LargeFileRatio getLargeFileRatio() {
            return this.largeFileRatio;
        }

        /**
         * @return mediumFileCount
         */
        public MediumFileCount getMediumFileCount() {
            return this.mediumFileCount;
        }

        /**
         * @return mediumFileCountDayGrowthRatio
         */
        public MediumFileCountDayGrowthRatio getMediumFileCountDayGrowthRatio() {
            return this.mediumFileCountDayGrowthRatio;
        }

        /**
         * @return mediumFileDayGrowthCount
         */
        public MediumFileDayGrowthCount getMediumFileDayGrowthCount() {
            return this.mediumFileDayGrowthCount;
        }

        /**
         * @return mediumFileRatio
         */
        public MediumFileRatio getMediumFileRatio() {
            return this.mediumFileRatio;
        }

        /**
         * @return partitionNum
         */
        public PartitionNum getPartitionNum() {
            return this.partitionNum;
        }

        /**
         * @return smallFileCount
         */
        public SmallFileCount getSmallFileCount() {
            return this.smallFileCount;
        }

        /**
         * @return smallFileCountDayGrowthRatio
         */
        public SmallFileCountDayGrowthRatio getSmallFileCountDayGrowthRatio() {
            return this.smallFileCountDayGrowthRatio;
        }

        /**
         * @return smallFileDayGrowthCount
         */
        public SmallFileDayGrowthCount getSmallFileDayGrowthCount() {
            return this.smallFileDayGrowthCount;
        }

        /**
         * @return smallFileRatio
         */
        public SmallFileRatio getSmallFileRatio() {
            return this.smallFileRatio;
        }

        /**
         * @return tableCount
         */
        public TableCount getTableCount() {
            return this.tableCount;
        }

        /**
         * @return tinyFileCount
         */
        public TinyFileCount getTinyFileCount() {
            return this.tinyFileCount;
        }

        /**
         * @return tinyFileCountDayGrowthRatio
         */
        public TinyFileCountDayGrowthRatio getTinyFileCountDayGrowthRatio() {
            return this.tinyFileCountDayGrowthRatio;
        }

        /**
         * @return tinyFileDayGrowthCount
         */
        public TinyFileDayGrowthCount getTinyFileDayGrowthCount() {
            return this.tinyFileDayGrowthCount;
        }

        /**
         * @return tinyFileRatio
         */
        public TinyFileRatio getTinyFileRatio() {
            return this.tinyFileRatio;
        }

        /**
         * @return totalDataDayGrowthSize
         */
        public TotalDataDayGrowthSize getTotalDataDayGrowthSize() {
            return this.totalDataDayGrowthSize;
        }

        /**
         * @return totalDataSize
         */
        public TotalDataSize getTotalDataSize() {
            return this.totalDataSize;
        }

        /**
         * @return totalDataSizeDayGrowthRatio
         */
        public TotalDataSizeDayGrowthRatio getTotalDataSizeDayGrowthRatio() {
            return this.totalDataSizeDayGrowthRatio;
        }

        /**
         * @return totalFileCount
         */
        public TotalFileCount getTotalFileCount() {
            return this.totalFileCount;
        }

        /**
         * @return totalFileCountDayGrowthRatio
         */
        public TotalFileCountDayGrowthRatio getTotalFileCountDayGrowthRatio() {
            return this.totalFileCountDayGrowthRatio;
        }

        /**
         * @return totalFileDayGrowthCount
         */
        public TotalFileDayGrowthCount getTotalFileDayGrowthCount() {
            return this.totalFileDayGrowthCount;
        }

        /**
         * @return warmDataDayGrowthSize
         */
        public WarmDataDayGrowthSize getWarmDataDayGrowthSize() {
            return this.warmDataDayGrowthSize;
        }

        /**
         * @return warmDataRatio
         */
        public WarmDataRatio getWarmDataRatio() {
            return this.warmDataRatio;
        }

        /**
         * @return warmDataSize
         */
        public WarmDataSize getWarmDataSize() {
            return this.warmDataSize;
        }

        /**
         * @return warmDataSizeDayGrowthRatio
         */
        public WarmDataSizeDayGrowthRatio getWarmDataSizeDayGrowthRatio() {
            return this.warmDataSizeDayGrowthRatio;
        }

        public static final class Builder {
            private ColdDataDayGrowthSize coldDataDayGrowthSize; 
            private ColdDataRatio coldDataRatio; 
            private ColdDataSize coldDataSize; 
            private ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio; 
            private EmptyFileCount emptyFileCount; 
            private EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio; 
            private EmptyFileDayGrowthCount emptyFileDayGrowthCount; 
            private EmptyFileRatio emptyFileRatio; 
            private FreezeDataDayGrowthSize freezeDataDayGrowthSize; 
            private FreezeDataRatio freezeDataRatio; 
            private FreezeDataSize freezeDataSize; 
            private FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio; 
            private HotDataDayGrowthSize hotDataDayGrowthSize; 
            private HotDataRatio hotDataRatio; 
            private HotDataSize hotDataSize; 
            private HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio; 
            private LargeFileCount largeFileCount; 
            private LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio; 
            private LargeFileDayGrowthCount largeFileDayGrowthCount; 
            private LargeFileRatio largeFileRatio; 
            private MediumFileCount mediumFileCount; 
            private MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio; 
            private MediumFileDayGrowthCount mediumFileDayGrowthCount; 
            private MediumFileRatio mediumFileRatio; 
            private PartitionNum partitionNum; 
            private SmallFileCount smallFileCount; 
            private SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio; 
            private SmallFileDayGrowthCount smallFileDayGrowthCount; 
            private SmallFileRatio smallFileRatio; 
            private TableCount tableCount; 
            private TinyFileCount tinyFileCount; 
            private TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio; 
            private TinyFileDayGrowthCount tinyFileDayGrowthCount; 
            private TinyFileRatio tinyFileRatio; 
            private TotalDataDayGrowthSize totalDataDayGrowthSize; 
            private TotalDataSize totalDataSize; 
            private TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio; 
            private TotalFileCount totalFileCount; 
            private TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio; 
            private TotalFileDayGrowthCount totalFileDayGrowthCount; 
            private WarmDataDayGrowthSize warmDataDayGrowthSize; 
            private WarmDataRatio warmDataRatio; 
            private WarmDataSize warmDataSize; 
            private WarmDataSizeDayGrowthRatio warmDataSizeDayGrowthRatio; 

            /**
             * <p>The daily increment of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</p>
             */
            public Builder coldDataDayGrowthSize(ColdDataDayGrowthSize coldDataDayGrowthSize) {
                this.coldDataDayGrowthSize = coldDataDayGrowthSize;
                return this;
            }

            /**
             * <p>The proportion of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</p>
             */
            public Builder coldDataRatio(ColdDataRatio coldDataRatio) {
                this.coldDataRatio = coldDataRatio;
                return this;
            }

            /**
             * <p>The amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</p>
             */
            public Builder coldDataSize(ColdDataSize coldDataSize) {
                this.coldDataSize = coldDataSize;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</p>
             */
            public Builder coldDataSizeDayGrowthRatio(ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio) {
                this.coldDataSizeDayGrowthRatio = coldDataSizeDayGrowthRatio;
                return this;
            }

            /**
             * <p>The number of empty files. Empty files are those with a size of 0 MB.</p>
             */
            public Builder emptyFileCount(EmptyFileCount emptyFileCount) {
                this.emptyFileCount = emptyFileCount;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the number of empty files. Empty files are those with a size of 0 MB.</p>
             */
            public Builder emptyFileCountDayGrowthRatio(EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio) {
                this.emptyFileCountDayGrowthRatio = emptyFileCountDayGrowthRatio;
                return this;
            }

            /**
             * <p>The daily increment of the number of empty files. Empty files are those with a size of 0 MB.</p>
             */
            public Builder emptyFileDayGrowthCount(EmptyFileDayGrowthCount emptyFileDayGrowthCount) {
                this.emptyFileDayGrowthCount = emptyFileDayGrowthCount;
                return this;
            }

            /**
             * <p>The proportion of empty files. Empty files are those with a size of 0 MB.</p>
             */
            public Builder emptyFileRatio(EmptyFileRatio emptyFileRatio) {
                this.emptyFileRatio = emptyFileRatio;
                return this;
            }

            /**
             * <p>The daily increment of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
             */
            public Builder freezeDataDayGrowthSize(FreezeDataDayGrowthSize freezeDataDayGrowthSize) {
                this.freezeDataDayGrowthSize = freezeDataDayGrowthSize;
                return this;
            }

            /**
             * <p>The proportion of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
             */
            public Builder freezeDataRatio(FreezeDataRatio freezeDataRatio) {
                this.freezeDataRatio = freezeDataRatio;
                return this;
            }

            /**
             * <p>The amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
             */
            public Builder freezeDataSize(FreezeDataSize freezeDataSize) {
                this.freezeDataSize = freezeDataSize;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</p>
             */
            public Builder freezeDataSizeDayGrowthRatio(FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio) {
                this.freezeDataSizeDayGrowthRatio = freezeDataSizeDayGrowthRatio;
                return this;
            }

            /**
             * <p>The daily increment of the amount of hot data. Hot data refers to data that is accessed in previous seven days.</p>
             */
            public Builder hotDataDayGrowthSize(HotDataDayGrowthSize hotDataDayGrowthSize) {
                this.hotDataDayGrowthSize = hotDataDayGrowthSize;
                return this;
            }

            /**
             * <p>The proportion of hot data. Hot data refers to data that is accessed in previous seven days.</p>
             */
            public Builder hotDataRatio(HotDataRatio hotDataRatio) {
                this.hotDataRatio = hotDataRatio;
                return this;
            }

            /**
             * <p>The amount of hot data. Hot data refers to data that is accessed in previous seven days.</p>
             */
            public Builder hotDataSize(HotDataSize hotDataSize) {
                this.hotDataSize = hotDataSize;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the amount of hot data. Hot data refers to data that is accessed in previous seven days.</p>
             */
            public Builder hotDataSizeDayGrowthRatio(HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio) {
                this.hotDataSizeDayGrowthRatio = hotDataSizeDayGrowthRatio;
                return this;
            }

            /**
             * <p>The number of large files. Large files are those with a size greater than 1 GB.</p>
             */
            public Builder largeFileCount(LargeFileCount largeFileCount) {
                this.largeFileCount = largeFileCount;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the number of large files. Large files are those with a size greater than 1 GB.</p>
             */
            public Builder largeFileCountDayGrowthRatio(LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio) {
                this.largeFileCountDayGrowthRatio = largeFileCountDayGrowthRatio;
                return this;
            }

            /**
             * <p>The daily increment of the number of large files. Large files are those with a size greater than 1 GB.</p>
             */
            public Builder largeFileDayGrowthCount(LargeFileDayGrowthCount largeFileDayGrowthCount) {
                this.largeFileDayGrowthCount = largeFileDayGrowthCount;
                return this;
            }

            /**
             * <p>The proportion of large files. Large files are those with a size greater than 1 GB.</p>
             */
            public Builder largeFileRatio(LargeFileRatio largeFileRatio) {
                this.largeFileRatio = largeFileRatio;
                return this;
            }

            /**
             * <p>The number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
             */
            public Builder mediumFileCount(MediumFileCount mediumFileCount) {
                this.mediumFileCount = mediumFileCount;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
             */
            public Builder mediumFileCountDayGrowthRatio(MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio) {
                this.mediumFileCountDayGrowthRatio = mediumFileCountDayGrowthRatio;
                return this;
            }

            /**
             * <p>The daily increment of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
             */
            public Builder mediumFileDayGrowthCount(MediumFileDayGrowthCount mediumFileDayGrowthCount) {
                this.mediumFileDayGrowthCount = mediumFileDayGrowthCount;
                return this;
            }

            /**
             * <p>The proportion of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</p>
             */
            public Builder mediumFileRatio(MediumFileRatio mediumFileRatio) {
                this.mediumFileRatio = mediumFileRatio;
                return this;
            }

            /**
             * <p>The number of partitions.</p>
             */
            public Builder partitionNum(PartitionNum partitionNum) {
                this.partitionNum = partitionNum;
                return this;
            }

            /**
             * <p>The number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
             */
            public Builder smallFileCount(SmallFileCount smallFileCount) {
                this.smallFileCount = smallFileCount;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
             */
            public Builder smallFileCountDayGrowthRatio(SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio) {
                this.smallFileCountDayGrowthRatio = smallFileCountDayGrowthRatio;
                return this;
            }

            /**
             * <p>The daily increment of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
             */
            public Builder smallFileDayGrowthCount(SmallFileDayGrowthCount smallFileDayGrowthCount) {
                this.smallFileDayGrowthCount = smallFileDayGrowthCount;
                return this;
            }

            /**
             * <p>The proportion of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</p>
             */
            public Builder smallFileRatio(SmallFileRatio smallFileRatio) {
                this.smallFileRatio = smallFileRatio;
                return this;
            }

            /**
             * <p>The number of tables.</p>
             */
            public Builder tableCount(TableCount tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * <p>The number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
             */
            public Builder tinyFileCount(TinyFileCount tinyFileCount) {
                this.tinyFileCount = tinyFileCount;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
             */
            public Builder tinyFileCountDayGrowthRatio(TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio) {
                this.tinyFileCountDayGrowthRatio = tinyFileCountDayGrowthRatio;
                return this;
            }

            /**
             * <p>The daily increment of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
             */
            public Builder tinyFileDayGrowthCount(TinyFileDayGrowthCount tinyFileDayGrowthCount) {
                this.tinyFileDayGrowthCount = tinyFileDayGrowthCount;
                return this;
            }

            /**
             * <p>The proportion of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</p>
             */
            public Builder tinyFileRatio(TinyFileRatio tinyFileRatio) {
                this.tinyFileRatio = tinyFileRatio;
                return this;
            }

            /**
             * <p>The daily incremental of the total amount of data.</p>
             */
            public Builder totalDataDayGrowthSize(TotalDataDayGrowthSize totalDataDayGrowthSize) {
                this.totalDataDayGrowthSize = totalDataDayGrowthSize;
                return this;
            }

            /**
             * <p>The total amount of data.</p>
             */
            public Builder totalDataSize(TotalDataSize totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the total data volume.</p>
             */
            public Builder totalDataSizeDayGrowthRatio(TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio) {
                this.totalDataSizeDayGrowthRatio = totalDataSizeDayGrowthRatio;
                return this;
            }

            /**
             * <p>The total number of files.</p>
             */
            public Builder totalFileCount(TotalFileCount totalFileCount) {
                this.totalFileCount = totalFileCount;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the total number of files.</p>
             */
            public Builder totalFileCountDayGrowthRatio(TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio) {
                this.totalFileCountDayGrowthRatio = totalFileCountDayGrowthRatio;
                return this;
            }

            /**
             * <p>The daily increment of the total number of files.</p>
             */
            public Builder totalFileDayGrowthCount(TotalFileDayGrowthCount totalFileDayGrowthCount) {
                this.totalFileDayGrowthCount = totalFileDayGrowthCount;
                return this;
            }

            /**
             * <p>The daily increment of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</p>
             */
            public Builder warmDataDayGrowthSize(WarmDataDayGrowthSize warmDataDayGrowthSize) {
                this.warmDataDayGrowthSize = warmDataDayGrowthSize;
                return this;
            }

            /**
             * <p>The proportion of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</p>
             */
            public Builder warmDataRatio(WarmDataRatio warmDataRatio) {
                this.warmDataRatio = warmDataRatio;
                return this;
            }

            /**
             * <p>The amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</p>
             */
            public Builder warmDataSize(WarmDataSize warmDataSize) {
                this.warmDataSize = warmDataSize;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</p>
             */
            public Builder warmDataSizeDayGrowthRatio(WarmDataSizeDayGrowthRatio warmDataSizeDayGrowthRatio) {
                this.warmDataSizeDayGrowthRatio = warmDataSizeDayGrowthRatio;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHiveDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHiveDatabaseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Analysis")
        private Analysis analysis;

        @com.aliyun.core.annotation.NameInMap("Formats")
        private java.util.List<Formats> formats;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
            this.formats = builder.formats;
            this.metrics = builder.metrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public Analysis getAnalysis() {
            return this.analysis;
        }

        /**
         * @return formats
         */
        public java.util.List<Formats> getFormats() {
            return this.formats;
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        public static final class Builder {
            private Analysis analysis; 
            private java.util.List<Formats> formats; 
            private Metrics metrics; 

            /**
             * <p>The analysis results.</p>
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>The information from the perspective of storage formats.</p>
             */
            public Builder formats(java.util.List<Formats> formats) {
                this.formats = formats;
                return this;
            }

            /**
             * <p>The metric information.</p>
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
