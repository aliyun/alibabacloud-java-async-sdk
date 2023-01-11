// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCardToDirectionalGroupRequest} extends {@link RequestModel}
 *
 * <p>AddCardToDirectionalGroupRequest</p>
 */
public class AddCardToDirectionalGroupRequest extends Request {
    @Query
    @NameInMap("AddType")
    @Validation(required = true)
    private String addType;

    @Body
    @NameInMap("ApiProduct")
    private String apiProduct;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("IccidList")
    @Validation(required = true)
    private java.util.List < String > iccidList;

    @Query
    @NameInMap("MsgNotify")
    private Boolean msgNotify;

    @Query
    @NameInMap("SerialNo")
    @Validation(required = true)
    private String serialNo;

    private AddCardToDirectionalGroupRequest(Builder builder) {
        super(builder);
        this.addType = builder.addType;
        this.apiProduct = builder.apiProduct;
        this.groupId = builder.groupId;
        this.iccidList = builder.iccidList;
        this.msgNotify = builder.msgNotify;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCardToDirectionalGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addType
     */
    public String getAddType() {
        return this.addType;
    }

    /**
     * @return apiProduct
     */
    public String getApiProduct() {
        return this.apiProduct;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return iccidList
     */
    public java.util.List < String > getIccidList() {
        return this.iccidList;
    }

    /**
     * @return msgNotify
     */
    public Boolean getMsgNotify() {
        return this.msgNotify;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<AddCardToDirectionalGroupRequest, Builder> {
        private String addType; 
        private String apiProduct; 
        private String groupId; 
        private java.util.List < String > iccidList; 
        private Boolean msgNotify; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(AddCardToDirectionalGroupRequest request) {
            super(request);
            this.addType = request.addType;
            this.apiProduct = request.apiProduct;
            this.groupId = request.groupId;
            this.iccidList = request.iccidList;
            this.msgNotify = request.msgNotify;
            this.serialNo = request.serialNo;
        } 

        /**
         * AddType.
         */
        public Builder addType(String addType) {
            this.putQueryParameter("AddType", addType);
            this.addType = addType;
            return this;
        }

        /**
         * Linkcard
         */
        public Builder apiProduct(String apiProduct) {
            this.putBodyParameter("ApiProduct", apiProduct);
            this.apiProduct = apiProduct;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IccidList.
         */
        public Builder iccidList(java.util.List < String > iccidList) {
            String iccidListShrink = shrink(iccidList, "IccidList", "json");
            this.putQueryParameter("IccidList", iccidListShrink);
            this.iccidList = iccidList;
            return this;
        }

        /**
         * MsgNotify.
         */
        public Builder msgNotify(Boolean msgNotify) {
            this.putQueryParameter("MsgNotify", msgNotify);
            this.msgNotify = msgNotify;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putQueryParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public AddCardToDirectionalGroupRequest build() {
            return new AddCardToDirectionalGroupRequest(this);
        } 

    } 

}
