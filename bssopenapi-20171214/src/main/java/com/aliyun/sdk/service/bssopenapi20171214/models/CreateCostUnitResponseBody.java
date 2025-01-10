// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link CreateCostUnitResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCostUnitResponseBody</p>
 */
public class CreateCostUnitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful！</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F5B803CF-94D8-43AF-ADB3-D819AAD30E27</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCostUnitResponseBody build() {
            return new CreateCostUnitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCostUnitResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCostUnitResponseBody</p>
     */
    public static class CostUnitDtoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("ParentUnitId")
        private Long parentUnitId;

        @com.aliyun.core.annotation.NameInMap("UnitId")
        private Long unitId;

        @com.aliyun.core.annotation.NameInMap("UnitName")
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
             * <p>The user ID of the owner of the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>26387563</p>
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * <p>The ID of the parent cost center. A value of -1 indicates the root cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder parentUnitId(Long parentUnitId) {
                this.parentUnitId = parentUnitId;
                return this;
            }

            /**
             * <p>The ID of the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>84327659328</p>
             */
            public Builder unitId(Long unitId) {
                this.unitId = unitId;
                return this;
            }

            /**
             * <p>The name of the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link CreateCostUnitResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCostUnitResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostUnitDtoList")
        private java.util.List<CostUnitDtoList> costUnitDtoList;

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
        public java.util.List<CostUnitDtoList> getCostUnitDtoList() {
            return this.costUnitDtoList;
        }

        public static final class Builder {
            private java.util.List<CostUnitDtoList> costUnitDtoList; 

            /**
             * <p>The list of cost center entities.</p>
             */
            public Builder costUnitDtoList(java.util.List<CostUnitDtoList> costUnitDtoList) {
                this.costUnitDtoList = costUnitDtoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
