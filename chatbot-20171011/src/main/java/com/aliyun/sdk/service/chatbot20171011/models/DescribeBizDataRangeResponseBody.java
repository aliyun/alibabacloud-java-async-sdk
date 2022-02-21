// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBizDataRangeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBizDataRangeResponseBody</p>
 */
public class DescribeBizDataRangeResponseBody extends TeaModel {
    @NameInMap("BizDataRangeId")
    private Long bizDataRangeId;

    @NameInMap("DataType")
    private Integer dataType;

    @NameInMap("ManageCode")
    private String manageCode;

    @NameInMap("Name")
    private String name;

    @NameInMap("ParentBizDataRangeId")
    private Long parentBizDataRangeId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBizDataRangeResponseBody(Builder builder) {
        this.bizDataRangeId = builder.bizDataRangeId;
        this.dataType = builder.dataType;
        this.manageCode = builder.manageCode;
        this.name = builder.name;
        this.parentBizDataRangeId = builder.parentBizDataRangeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizDataRangeResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizDataRangeId
     */
    public Long getBizDataRangeId() {
        return this.bizDataRangeId;
    }

    /**
     * @return dataType
     */
    public Integer getDataType() {
        return this.dataType;
    }

    /**
     * @return manageCode
     */
    public String getManageCode() {
        return this.manageCode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentBizDataRangeId
     */
    public Long getParentBizDataRangeId() {
        return this.parentBizDataRangeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long bizDataRangeId; 
        private Integer dataType; 
        private String manageCode; 
        private String name; 
        private Long parentBizDataRangeId; 
        private String requestId; 

        /**
         * BizDataRangeId.
         */
        public Builder bizDataRangeId(Long bizDataRangeId) {
            this.bizDataRangeId = bizDataRangeId;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * ManageCode.
         */
        public Builder manageCode(String manageCode) {
            this.manageCode = manageCode;
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
         * ParentBizDataRangeId.
         */
        public Builder parentBizDataRangeId(Long parentBizDataRangeId) {
            this.parentBizDataRangeId = parentBizDataRangeId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBizDataRangeResponseBody build() {
            return new DescribeBizDataRangeResponseBody(this);
        } 

    } 

}
