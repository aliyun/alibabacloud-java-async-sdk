// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryAccountDeliveryAddressInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountDeliveryAddressInfoResponseBody</p>
 */
public class QueryAccountDeliveryAddressInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAccountDeliveryAddressInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountDeliveryAddressInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAccountDeliveryAddressInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAccountDeliveryAddressInfoResponseBody build() {
            return new QueryAccountDeliveryAddressInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccountDeliveryAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountDeliveryAddressInfoResponseBody</p>
     */
    public static class AreaDivision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DivisionAbbName")
        private String divisionAbbName;

        @com.aliyun.core.annotation.NameInMap("DivisionId")
        private Long divisionId;

        @com.aliyun.core.annotation.NameInMap("DivisionLevel")
        private Long divisionLevel;

        @com.aliyun.core.annotation.NameInMap("DivisionName")
        private String divisionName;

        @com.aliyun.core.annotation.NameInMap("DivisionTname")
        private String divisionTname;

        @com.aliyun.core.annotation.NameInMap("NewDivisionId")
        private Long newDivisionId;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("Pinyin")
        private String pinyin;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private AreaDivision(Builder builder) {
            this.divisionAbbName = builder.divisionAbbName;
            this.divisionId = builder.divisionId;
            this.divisionLevel = builder.divisionLevel;
            this.divisionName = builder.divisionName;
            this.divisionTname = builder.divisionTname;
            this.newDivisionId = builder.newDivisionId;
            this.parentId = builder.parentId;
            this.pinyin = builder.pinyin;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AreaDivision create() {
            return builder().build();
        }

        /**
         * @return divisionAbbName
         */
        public String getDivisionAbbName() {
            return this.divisionAbbName;
        }

        /**
         * @return divisionId
         */
        public Long getDivisionId() {
            return this.divisionId;
        }

        /**
         * @return divisionLevel
         */
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        /**
         * @return divisionName
         */
        public String getDivisionName() {
            return this.divisionName;
        }

        /**
         * @return divisionTname
         */
        public String getDivisionTname() {
            return this.divisionTname;
        }

        /**
         * @return newDivisionId
         */
        public Long getNewDivisionId() {
            return this.newDivisionId;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return pinyin
         */
        public String getPinyin() {
            return this.pinyin;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String divisionAbbName; 
            private Long divisionId; 
            private Long divisionLevel; 
            private String divisionName; 
            private String divisionTname; 
            private Long newDivisionId; 
            private Long parentId; 
            private String pinyin; 
            private String remark; 

            private Builder() {
            } 

            private Builder(AreaDivision model) {
                this.divisionAbbName = model.divisionAbbName;
                this.divisionId = model.divisionId;
                this.divisionLevel = model.divisionLevel;
                this.divisionName = model.divisionName;
                this.divisionTname = model.divisionTname;
                this.newDivisionId = model.newDivisionId;
                this.parentId = model.parentId;
                this.pinyin = model.pinyin;
                this.remark = model.remark;
            } 

            /**
             * DivisionAbbName.
             */
            public Builder divisionAbbName(String divisionAbbName) {
                this.divisionAbbName = divisionAbbName;
                return this;
            }

            /**
             * DivisionId.
             */
            public Builder divisionId(Long divisionId) {
                this.divisionId = divisionId;
                return this;
            }

            /**
             * DivisionLevel.
             */
            public Builder divisionLevel(Long divisionLevel) {
                this.divisionLevel = divisionLevel;
                return this;
            }

            /**
             * DivisionName.
             */
            public Builder divisionName(String divisionName) {
                this.divisionName = divisionName;
                return this;
            }

            /**
             * DivisionTname.
             */
            public Builder divisionTname(String divisionTname) {
                this.divisionTname = divisionTname;
                return this;
            }

            /**
             * NewDivisionId.
             */
            public Builder newDivisionId(Long newDivisionId) {
                this.newDivisionId = newDivisionId;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Pinyin.
             */
            public Builder pinyin(String pinyin) {
                this.pinyin = pinyin;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public AreaDivision build() {
                return new AreaDivision(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountDeliveryAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountDeliveryAddressInfoResponseBody</p>
     */
    public static class CityDivision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DivisionAbbName")
        private String divisionAbbName;

        @com.aliyun.core.annotation.NameInMap("DivisionId")
        private Long divisionId;

        @com.aliyun.core.annotation.NameInMap("DivisionLevel")
        private Long divisionLevel;

        @com.aliyun.core.annotation.NameInMap("DivisionName")
        private String divisionName;

        @com.aliyun.core.annotation.NameInMap("DivisionTname")
        private String divisionTname;

        @com.aliyun.core.annotation.NameInMap("NewDivisionId")
        private Long newDivisionId;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("Pinyin")
        private String pinyin;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private CityDivision(Builder builder) {
            this.divisionAbbName = builder.divisionAbbName;
            this.divisionId = builder.divisionId;
            this.divisionLevel = builder.divisionLevel;
            this.divisionName = builder.divisionName;
            this.divisionTname = builder.divisionTname;
            this.newDivisionId = builder.newDivisionId;
            this.parentId = builder.parentId;
            this.pinyin = builder.pinyin;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CityDivision create() {
            return builder().build();
        }

        /**
         * @return divisionAbbName
         */
        public String getDivisionAbbName() {
            return this.divisionAbbName;
        }

        /**
         * @return divisionId
         */
        public Long getDivisionId() {
            return this.divisionId;
        }

        /**
         * @return divisionLevel
         */
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        /**
         * @return divisionName
         */
        public String getDivisionName() {
            return this.divisionName;
        }

        /**
         * @return divisionTname
         */
        public String getDivisionTname() {
            return this.divisionTname;
        }

        /**
         * @return newDivisionId
         */
        public Long getNewDivisionId() {
            return this.newDivisionId;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return pinyin
         */
        public String getPinyin() {
            return this.pinyin;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String divisionAbbName; 
            private Long divisionId; 
            private Long divisionLevel; 
            private String divisionName; 
            private String divisionTname; 
            private Long newDivisionId; 
            private Long parentId; 
            private String pinyin; 
            private String remark; 

            private Builder() {
            } 

            private Builder(CityDivision model) {
                this.divisionAbbName = model.divisionAbbName;
                this.divisionId = model.divisionId;
                this.divisionLevel = model.divisionLevel;
                this.divisionName = model.divisionName;
                this.divisionTname = model.divisionTname;
                this.newDivisionId = model.newDivisionId;
                this.parentId = model.parentId;
                this.pinyin = model.pinyin;
                this.remark = model.remark;
            } 

            /**
             * DivisionAbbName.
             */
            public Builder divisionAbbName(String divisionAbbName) {
                this.divisionAbbName = divisionAbbName;
                return this;
            }

            /**
             * DivisionId.
             */
            public Builder divisionId(Long divisionId) {
                this.divisionId = divisionId;
                return this;
            }

            /**
             * DivisionLevel.
             */
            public Builder divisionLevel(Long divisionLevel) {
                this.divisionLevel = divisionLevel;
                return this;
            }

            /**
             * DivisionName.
             */
            public Builder divisionName(String divisionName) {
                this.divisionName = divisionName;
                return this;
            }

            /**
             * DivisionTname.
             */
            public Builder divisionTname(String divisionTname) {
                this.divisionTname = divisionTname;
                return this;
            }

            /**
             * NewDivisionId.
             */
            public Builder newDivisionId(Long newDivisionId) {
                this.newDivisionId = newDivisionId;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Pinyin.
             */
            public Builder pinyin(String pinyin) {
                this.pinyin = pinyin;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public CityDivision build() {
                return new CityDivision(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountDeliveryAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountDeliveryAddressInfoResponseBody</p>
     */
    public static class ProviceDivision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DivisionAbbName")
        private String divisionAbbName;

        @com.aliyun.core.annotation.NameInMap("DivisionId")
        private Long divisionId;

        @com.aliyun.core.annotation.NameInMap("DivisionLevel")
        private Long divisionLevel;

        @com.aliyun.core.annotation.NameInMap("DivisionName")
        private String divisionName;

        @com.aliyun.core.annotation.NameInMap("DivisionTname")
        private String divisionTname;

        @com.aliyun.core.annotation.NameInMap("NewDivisionId")
        private Long newDivisionId;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("Pinyin")
        private String pinyin;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private ProviceDivision(Builder builder) {
            this.divisionAbbName = builder.divisionAbbName;
            this.divisionId = builder.divisionId;
            this.divisionLevel = builder.divisionLevel;
            this.divisionName = builder.divisionName;
            this.divisionTname = builder.divisionTname;
            this.newDivisionId = builder.newDivisionId;
            this.parentId = builder.parentId;
            this.pinyin = builder.pinyin;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProviceDivision create() {
            return builder().build();
        }

        /**
         * @return divisionAbbName
         */
        public String getDivisionAbbName() {
            return this.divisionAbbName;
        }

        /**
         * @return divisionId
         */
        public Long getDivisionId() {
            return this.divisionId;
        }

        /**
         * @return divisionLevel
         */
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        /**
         * @return divisionName
         */
        public String getDivisionName() {
            return this.divisionName;
        }

        /**
         * @return divisionTname
         */
        public String getDivisionTname() {
            return this.divisionTname;
        }

        /**
         * @return newDivisionId
         */
        public Long getNewDivisionId() {
            return this.newDivisionId;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return pinyin
         */
        public String getPinyin() {
            return this.pinyin;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String divisionAbbName; 
            private Long divisionId; 
            private Long divisionLevel; 
            private String divisionName; 
            private String divisionTname; 
            private Long newDivisionId; 
            private Long parentId; 
            private String pinyin; 
            private String remark; 

            private Builder() {
            } 

            private Builder(ProviceDivision model) {
                this.divisionAbbName = model.divisionAbbName;
                this.divisionId = model.divisionId;
                this.divisionLevel = model.divisionLevel;
                this.divisionName = model.divisionName;
                this.divisionTname = model.divisionTname;
                this.newDivisionId = model.newDivisionId;
                this.parentId = model.parentId;
                this.pinyin = model.pinyin;
                this.remark = model.remark;
            } 

            /**
             * DivisionAbbName.
             */
            public Builder divisionAbbName(String divisionAbbName) {
                this.divisionAbbName = divisionAbbName;
                return this;
            }

            /**
             * DivisionId.
             */
            public Builder divisionId(Long divisionId) {
                this.divisionId = divisionId;
                return this;
            }

            /**
             * DivisionLevel.
             */
            public Builder divisionLevel(Long divisionLevel) {
                this.divisionLevel = divisionLevel;
                return this;
            }

            /**
             * DivisionName.
             */
            public Builder divisionName(String divisionName) {
                this.divisionName = divisionName;
                return this;
            }

            /**
             * DivisionTname.
             */
            public Builder divisionTname(String divisionTname) {
                this.divisionTname = divisionTname;
                return this;
            }

            /**
             * NewDivisionId.
             */
            public Builder newDivisionId(Long newDivisionId) {
                this.newDivisionId = newDivisionId;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Pinyin.
             */
            public Builder pinyin(String pinyin) {
                this.pinyin = pinyin;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public ProviceDivision build() {
                return new ProviceDivision(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountDeliveryAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountDeliveryAddressInfoResponseBody</p>
     */
    public static class TownDivision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DivisionAbbName")
        private String divisionAbbName;

        @com.aliyun.core.annotation.NameInMap("DivisionId")
        private Long divisionId;

        @com.aliyun.core.annotation.NameInMap("DivisionLevel")
        private Long divisionLevel;

        @com.aliyun.core.annotation.NameInMap("DivisionName")
        private String divisionName;

        @com.aliyun.core.annotation.NameInMap("DivisionTname")
        private String divisionTname;

        @com.aliyun.core.annotation.NameInMap("NewDivisionId")
        private Long newDivisionId;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("Pinyin")
        private String pinyin;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private TownDivision(Builder builder) {
            this.divisionAbbName = builder.divisionAbbName;
            this.divisionId = builder.divisionId;
            this.divisionLevel = builder.divisionLevel;
            this.divisionName = builder.divisionName;
            this.divisionTname = builder.divisionTname;
            this.newDivisionId = builder.newDivisionId;
            this.parentId = builder.parentId;
            this.pinyin = builder.pinyin;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TownDivision create() {
            return builder().build();
        }

        /**
         * @return divisionAbbName
         */
        public String getDivisionAbbName() {
            return this.divisionAbbName;
        }

        /**
         * @return divisionId
         */
        public Long getDivisionId() {
            return this.divisionId;
        }

        /**
         * @return divisionLevel
         */
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        /**
         * @return divisionName
         */
        public String getDivisionName() {
            return this.divisionName;
        }

        /**
         * @return divisionTname
         */
        public String getDivisionTname() {
            return this.divisionTname;
        }

        /**
         * @return newDivisionId
         */
        public Long getNewDivisionId() {
            return this.newDivisionId;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return pinyin
         */
        public String getPinyin() {
            return this.pinyin;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String divisionAbbName; 
            private Long divisionId; 
            private Long divisionLevel; 
            private String divisionName; 
            private String divisionTname; 
            private Long newDivisionId; 
            private Long parentId; 
            private String pinyin; 
            private String remark; 

            private Builder() {
            } 

            private Builder(TownDivision model) {
                this.divisionAbbName = model.divisionAbbName;
                this.divisionId = model.divisionId;
                this.divisionLevel = model.divisionLevel;
                this.divisionName = model.divisionName;
                this.divisionTname = model.divisionTname;
                this.newDivisionId = model.newDivisionId;
                this.parentId = model.parentId;
                this.pinyin = model.pinyin;
                this.remark = model.remark;
            } 

            /**
             * DivisionAbbName.
             */
            public Builder divisionAbbName(String divisionAbbName) {
                this.divisionAbbName = divisionAbbName;
                return this;
            }

            /**
             * DivisionId.
             */
            public Builder divisionId(Long divisionId) {
                this.divisionId = divisionId;
                return this;
            }

            /**
             * DivisionLevel.
             */
            public Builder divisionLevel(Long divisionLevel) {
                this.divisionLevel = divisionLevel;
                return this;
            }

            /**
             * DivisionName.
             */
            public Builder divisionName(String divisionName) {
                this.divisionName = divisionName;
                return this;
            }

            /**
             * DivisionTname.
             */
            public Builder divisionTname(String divisionTname) {
                this.divisionTname = divisionTname;
                return this;
            }

            /**
             * NewDivisionId.
             */
            public Builder newDivisionId(Long newDivisionId) {
                this.newDivisionId = newDivisionId;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Pinyin.
             */
            public Builder pinyin(String pinyin) {
                this.pinyin = pinyin;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public TownDivision build() {
                return new TownDivision(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountDeliveryAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountDeliveryAddressInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AreaDivision")
        private AreaDivision areaDivision;

        @com.aliyun.core.annotation.NameInMap("AreaId")
        private String areaId;

        @com.aliyun.core.annotation.NameInMap("CityDivision")
        private CityDivision cityDivision;

        @com.aliyun.core.annotation.NameInMap("CityId")
        private String cityId;

        @com.aliyun.core.annotation.NameInMap("Contacts")
        private String contacts;

        @com.aliyun.core.annotation.NameInMap("DefaultAddress")
        private Boolean defaultAddress;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("Postalcode")
        private String postalcode;

        @com.aliyun.core.annotation.NameInMap("ProviceDivision")
        private ProviceDivision proviceDivision;

        @com.aliyun.core.annotation.NameInMap("ProviceId")
        private String proviceId;

        @com.aliyun.core.annotation.NameInMap("TownDivision")
        private TownDivision townDivision;

        @com.aliyun.core.annotation.NameInMap("TownId")
        private String townId;

        private Data(Builder builder) {
            this.address = builder.address;
            this.areaDivision = builder.areaDivision;
            this.areaId = builder.areaId;
            this.cityDivision = builder.cityDivision;
            this.cityId = builder.cityId;
            this.contacts = builder.contacts;
            this.defaultAddress = builder.defaultAddress;
            this.email = builder.email;
            this.mobile = builder.mobile;
            this.phone = builder.phone;
            this.pk = builder.pk;
            this.postalcode = builder.postalcode;
            this.proviceDivision = builder.proviceDivision;
            this.proviceId = builder.proviceId;
            this.townDivision = builder.townDivision;
            this.townId = builder.townId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return areaDivision
         */
        public AreaDivision getAreaDivision() {
            return this.areaDivision;
        }

        /**
         * @return areaId
         */
        public String getAreaId() {
            return this.areaId;
        }

        /**
         * @return cityDivision
         */
        public CityDivision getCityDivision() {
            return this.cityDivision;
        }

        /**
         * @return cityId
         */
        public String getCityId() {
            return this.cityId;
        }

        /**
         * @return contacts
         */
        public String getContacts() {
            return this.contacts;
        }

        /**
         * @return defaultAddress
         */
        public Boolean getDefaultAddress() {
            return this.defaultAddress;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return postalcode
         */
        public String getPostalcode() {
            return this.postalcode;
        }

        /**
         * @return proviceDivision
         */
        public ProviceDivision getProviceDivision() {
            return this.proviceDivision;
        }

        /**
         * @return proviceId
         */
        public String getProviceId() {
            return this.proviceId;
        }

        /**
         * @return townDivision
         */
        public TownDivision getTownDivision() {
            return this.townDivision;
        }

        /**
         * @return townId
         */
        public String getTownId() {
            return this.townId;
        }

        public static final class Builder {
            private String address; 
            private AreaDivision areaDivision; 
            private String areaId; 
            private CityDivision cityDivision; 
            private String cityId; 
            private String contacts; 
            private Boolean defaultAddress; 
            private String email; 
            private String mobile; 
            private String phone; 
            private String pk; 
            private String postalcode; 
            private ProviceDivision proviceDivision; 
            private String proviceId; 
            private TownDivision townDivision; 
            private String townId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.address = model.address;
                this.areaDivision = model.areaDivision;
                this.areaId = model.areaId;
                this.cityDivision = model.cityDivision;
                this.cityId = model.cityId;
                this.contacts = model.contacts;
                this.defaultAddress = model.defaultAddress;
                this.email = model.email;
                this.mobile = model.mobile;
                this.phone = model.phone;
                this.pk = model.pk;
                this.postalcode = model.postalcode;
                this.proviceDivision = model.proviceDivision;
                this.proviceId = model.proviceId;
                this.townDivision = model.townDivision;
                this.townId = model.townId;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AreaDivision.
             */
            public Builder areaDivision(AreaDivision areaDivision) {
                this.areaDivision = areaDivision;
                return this;
            }

            /**
             * AreaId.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * CityDivision.
             */
            public Builder cityDivision(CityDivision cityDivision) {
                this.cityDivision = cityDivision;
                return this;
            }

            /**
             * CityId.
             */
            public Builder cityId(String cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * Contacts.
             */
            public Builder contacts(String contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * DefaultAddress.
             */
            public Builder defaultAddress(Boolean defaultAddress) {
                this.defaultAddress = defaultAddress;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * Postalcode.
             */
            public Builder postalcode(String postalcode) {
                this.postalcode = postalcode;
                return this;
            }

            /**
             * ProviceDivision.
             */
            public Builder proviceDivision(ProviceDivision proviceDivision) {
                this.proviceDivision = proviceDivision;
                return this;
            }

            /**
             * ProviceId.
             */
            public Builder proviceId(String proviceId) {
                this.proviceId = proviceId;
                return this;
            }

            /**
             * TownDivision.
             */
            public Builder townDivision(TownDivision townDivision) {
                this.townDivision = townDivision;
                return this;
            }

            /**
             * TownId.
             */
            public Builder townId(String townId) {
                this.townId = townId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
