// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeLocationInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLocationInfoResponseBody</p>
 */
public class DescribeLocationInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CnCount")
    private Integer cnCount;

    @com.aliyun.core.annotation.NameInMap("CnList")
    private java.util.List<CnList> cnList;

    @com.aliyun.core.annotation.NameInMap("CnProvinceList")
    private java.util.List<CnProvinceList> cnProvinceList;

    @com.aliyun.core.annotation.NameInMap("OverseasCount")
    private Integer overseasCount;

    @com.aliyun.core.annotation.NameInMap("OverseasList")
    private java.util.List<OverseasList> overseasList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLocationInfoResponseBody(Builder builder) {
        this.cnCount = builder.cnCount;
        this.cnList = builder.cnList;
        this.cnProvinceList = builder.cnProvinceList;
        this.overseasCount = builder.overseasCount;
        this.overseasList = builder.overseasList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLocationInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnCount
     */
    public Integer getCnCount() {
        return this.cnCount;
    }

    /**
     * @return cnList
     */
    public java.util.List<CnList> getCnList() {
        return this.cnList;
    }

    /**
     * @return cnProvinceList
     */
    public java.util.List<CnProvinceList> getCnProvinceList() {
        return this.cnProvinceList;
    }

    /**
     * @return overseasCount
     */
    public Integer getOverseasCount() {
        return this.overseasCount;
    }

    /**
     * @return overseasList
     */
    public java.util.List<OverseasList> getOverseasList() {
        return this.overseasList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer cnCount; 
        private java.util.List<CnList> cnList; 
        private java.util.List<CnProvinceList> cnProvinceList; 
        private Integer overseasCount; 
        private java.util.List<OverseasList> overseasList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLocationInfoResponseBody model) {
            this.cnCount = model.cnCount;
            this.cnList = model.cnList;
            this.cnProvinceList = model.cnProvinceList;
            this.overseasCount = model.overseasCount;
            this.overseasList = model.overseasList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of regions in China.</p>
         * 
         * <strong>example:</strong>
         * <p>340</p>
         */
        public Builder cnCount(Integer cnCount) {
            this.cnCount = cnCount;
            return this;
        }

        /**
         * <p>The list of regions in China.</p>
         */
        public Builder cnList(java.util.List<CnList> cnList) {
            this.cnList = cnList;
            return this;
        }

        /**
         * <p>The information about provinces and cities in China.</p>
         */
        public Builder cnProvinceList(java.util.List<CnProvinceList> cnProvinceList) {
            this.cnProvinceList = cnProvinceList;
            return this;
        }

        /**
         * <p>The number of regions outside China.</p>
         * 
         * <strong>example:</strong>
         * <p>238</p>
         */
        public Builder overseasCount(Integer overseasCount) {
            this.overseasCount = overseasCount;
            return this;
        }

        /**
         * <p>The list of regions outside China.</p>
         */
        public Builder overseasList(java.util.List<OverseasList> overseasList) {
            this.overseasList = overseasList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CD3BE433-FAB0-55D8-918A-69B306****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLocationInfoResponseBody build() {
            return new DescribeLocationInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLocationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLocationInfoResponseBody</p>
     */
    public static class CnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocId")
        private String locId;

        @com.aliyun.core.annotation.NameInMap("LocName")
        private String locName;

        private CnList(Builder builder) {
            this.locId = builder.locId;
            this.locName = builder.locName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CnList create() {
            return builder().build();
        }

        /**
         * @return locId
         */
        public String getLocId() {
            return this.locId;
        }

        /**
         * @return locName
         */
        public String getLocName() {
            return this.locName;
        }

        public static final class Builder {
            private String locId; 
            private String locName; 

            private Builder() {
            } 

            private Builder(CnList model) {
                this.locId = model.locId;
                this.locName = model.locName;
            } 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>3301</p>
             */
            public Builder locId(String locId) {
                this.locId = locId;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou City</p>
             */
            public Builder locName(String locName) {
                this.locName = locName;
                return this;
            }

            public CnList build() {
                return new CnList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLocationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLocationInfoResponseBody</p>
     */
    public static class Cities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocId")
        private String locId;

        @com.aliyun.core.annotation.NameInMap("LocName")
        private String locName;

        private Cities(Builder builder) {
            this.locId = builder.locId;
            this.locName = builder.locName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cities create() {
            return builder().build();
        }

        /**
         * @return locId
         */
        public String getLocId() {
            return this.locId;
        }

        /**
         * @return locName
         */
        public String getLocName() {
            return this.locName;
        }

        public static final class Builder {
            private String locId; 
            private String locName; 

            private Builder() {
            } 

            private Builder(Cities model) {
                this.locId = model.locId;
                this.locName = model.locName;
            } 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder locId(String locId) {
                this.locId = locId;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder locName(String locName) {
                this.locName = locName;
                return this;
            }

            public Cities build() {
                return new Cities(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLocationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLocationInfoResponseBody</p>
     */
    public static class CnProvinceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cities")
        private java.util.List<Cities> cities;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        private String provinceName;

        private CnProvinceList(Builder builder) {
            this.cities = builder.cities;
            this.provinceName = builder.provinceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CnProvinceList create() {
            return builder().build();
        }

        /**
         * @return cities
         */
        public java.util.List<Cities> getCities() {
            return this.cities;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        public static final class Builder {
            private java.util.List<Cities> cities; 
            private String provinceName; 

            private Builder() {
            } 

            private Builder(CnProvinceList model) {
                this.cities = model.cities;
                this.provinceName = model.provinceName;
            } 

            /**
             * <p>The list of city codes.</p>
             */
            public Builder cities(java.util.List<Cities> cities) {
                this.cities = cities;
                return this;
            }

            /**
             * <p>The name of the province.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang</p>
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            public CnProvinceList build() {
                return new CnProvinceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLocationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLocationInfoResponseBody</p>
     */
    public static class OverseasList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocId")
        private String locId;

        @com.aliyun.core.annotation.NameInMap("LocName")
        private String locName;

        private OverseasList(Builder builder) {
            this.locId = builder.locId;
            this.locName = builder.locName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverseasList create() {
            return builder().build();
        }

        /**
         * @return locId
         */
        public String getLocId() {
            return this.locId;
        }

        /**
         * @return locName
         */
        public String getLocName() {
            return this.locName;
        }

        public static final class Builder {
            private String locId; 
            private String locName; 

            private Builder() {
            } 

            private Builder(OverseasList model) {
                this.locId = model.locId;
                this.locName = model.locName;
            } 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>US</p>
             */
            public Builder locId(String locId) {
                this.locId = locId;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>United States</p>
             */
            public Builder locName(String locName) {
                this.locName = locName;
                return this;
            }

            public OverseasList build() {
                return new OverseasList(this);
            } 

        } 

    }
}
