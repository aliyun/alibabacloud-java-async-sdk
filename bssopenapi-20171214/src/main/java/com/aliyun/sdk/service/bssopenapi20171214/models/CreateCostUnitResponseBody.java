// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCostUnitResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCostUnitResponseBody</p>
 */
public class CreateCostUnitResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateCostUnitResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCostUnitResponseBody create() {
        return builder().build();
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
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

        public CreateCostUnitResponseBody build() {
            return new CreateCostUnitResponseBody(this);
        } 

    } 

    public static class CostUnitDtoList extends TeaModel {
        @NameInMap("OwnerUid")
        private Long ownerUid;

        @NameInMap("ParentUnitId")
        private Long parentUnitId;

        @NameInMap("UnitId")
        private Long unitId;

        @NameInMap("UnitName")
        private String unitName;

        private CostUnitDtoList(Builder builder) {
            this.ownerUid = builder.ownerUid;
            this.parentUnitId = builder.parentUnitId;
            this.unitId = builder.unitId;
            this.unitName = builder.unitName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostUnitDtoList create() {
            return builder().build();
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return parentUnitId
         */
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        /**
         * @return unitId
         */
        public Long getUnitId() {
            return this.unitId;
        }

        /**
         * @return unitName
         */
        public String getUnitName() {
            return this.unitName;
        }

        public static final class Builder {
            private Long ownerUid; 
            private Long parentUnitId; 
            private Long unitId; 
            private String unitName; 

            /**
             * OwnerUid.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * ParentUnitId.
             */
            public Builder parentUnitId(Long parentUnitId) {
                this.parentUnitId = parentUnitId;
                return this;
            }

            /**
             * UnitId.
             */
            public Builder unitId(Long unitId) {
                this.unitId = unitId;
                return this;
            }

            /**
             * UnitName.
             */
            public Builder unitName(String unitName) {
                this.unitName = unitName;
                return this;
            }

            public CostUnitDtoList build() {
                return new CostUnitDtoList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CostUnitDtoList")
        private java.util.List < CostUnitDtoList> costUnitDtoList;

        private Data(Builder builder) {
            this.costUnitDtoList = builder.costUnitDtoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return costUnitDtoList
         */
        public java.util.List < CostUnitDtoList> getCostUnitDtoList() {
            return this.costUnitDtoList;
        }

        public static final class Builder {
            private java.util.List < CostUnitDtoList> costUnitDtoList; 

            /**
             * CostUnitDtoList.
             */
            public Builder costUnitDtoList(java.util.List < CostUnitDtoList> costUnitDtoList) {
                this.costUnitDtoList = costUnitDtoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
