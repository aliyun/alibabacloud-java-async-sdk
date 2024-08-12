// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachLabelsRequest} extends {@link RequestModel}
 *
 * <p>AttachLabelsRequest</p>
 */
public class AttachLabelsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelIds")
    private String labelIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNoList")
    private String serialNoList;

    private AttachLabelsRequest(Builder builder) {
        super(builder);
        this.labelIds = builder.labelIds;
        this.serialNo = builder.serialNo;
        this.serialNoList = builder.serialNoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachLabelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelIds
     */
    public String getLabelIds() {
        return this.labelIds;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return serialNoList
     */
    public String getSerialNoList() {
        return this.serialNoList;
    }

    public static final class Builder extends Request.Builder<AttachLabelsRequest, Builder> {
        private String labelIds; 
        private String serialNo; 
        private String serialNoList; 

        private Builder() {
            super();
        } 

        private Builder(AttachLabelsRequest request) {
            super(request);
            this.labelIds = request.labelIds;
            this.serialNo = request.serialNo;
            this.serialNoList = request.serialNoList;
        } 

        /**
         * LabelIds.
         */
        public Builder labelIds(String labelIds) {
            this.putBodyParameter("LabelIds", labelIds);
            this.labelIds = labelIds;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * SerialNoList.
         */
        public Builder serialNoList(String serialNoList) {
            this.putBodyParameter("SerialNoList", serialNoList);
            this.serialNoList = serialNoList;
            return this;
        }

        @Override
        public AttachLabelsRequest build() {
            return new AttachLabelsRequest(this);
        } 

    } 

}
