// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrustDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListTrustDevicesRequest</p>
 */
public class ListTrustDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelContent")
    private String labelContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    private String labelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserCustomId")
    private String userCustomId;

    private ListTrustDevicesRequest(Builder builder) {
        super(builder);
        this.labelContent = builder.labelContent;
        this.labelId = builder.labelId;
        this.serialNo = builder.serialNo;
        this.userCustomId = builder.userCustomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrustDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelContent
     */
    public String getLabelContent() {
        return this.labelContent;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return userCustomId
     */
    public String getUserCustomId() {
        return this.userCustomId;
    }

    public static final class Builder extends Request.Builder<ListTrustDevicesRequest, Builder> {
        private String labelContent; 
        private String labelId; 
        private String serialNo; 
        private String userCustomId; 

        private Builder() {
            super();
        } 

        private Builder(ListTrustDevicesRequest request) {
            super(request);
            this.labelContent = request.labelContent;
            this.labelId = request.labelId;
            this.serialNo = request.serialNo;
            this.userCustomId = request.userCustomId;
        } 

        /**
         * LabelContent.
         */
        public Builder labelContent(String labelContent) {
            this.putBodyParameter("LabelContent", labelContent);
            this.labelContent = labelContent;
            return this;
        }

        /**
         * LabelId.
         */
        public Builder labelId(String labelId) {
            this.putBodyParameter("LabelId", labelId);
            this.labelId = labelId;
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
         * UserCustomId.
         */
        public Builder userCustomId(String userCustomId) {
            this.putBodyParameter("UserCustomId", userCustomId);
            this.userCustomId = userCustomId;
            return this;
        }

        @Override
        public ListTrustDevicesRequest build() {
            return new ListTrustDevicesRequest(this);
        } 

    } 

}
