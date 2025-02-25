// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnbindDeviceSeatsRequest} extends {@link RequestModel}
 *
 * <p>UnbindDeviceSeatsRequest</p>
 */
public class UnbindDeviceSeatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNoList")
    private java.util.List < String > serialNoList;

    private UnbindDeviceSeatsRequest(Builder builder) {
        super(builder);
        this.serialNoList = builder.serialNoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindDeviceSeatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serialNoList
     */
    public java.util.List < String > getSerialNoList() {
        return this.serialNoList;
    }

    public static final class Builder extends Request.Builder<UnbindDeviceSeatsRequest, Builder> {
        private java.util.List < String > serialNoList; 

        private Builder() {
            super();
        } 

        private Builder(UnbindDeviceSeatsRequest request) {
            super(request);
            this.serialNoList = request.serialNoList;
        } 

        /**
         * SerialNoList.
         */
        public Builder serialNoList(java.util.List < String > serialNoList) {
            String serialNoListShrink = shrink(serialNoList, "SerialNoList", "json");
            this.putBodyParameter("SerialNoList", serialNoListShrink);
            this.serialNoList = serialNoList;
            return this;
        }

        @Override
        public UnbindDeviceSeatsRequest build() {
            return new UnbindDeviceSeatsRequest(this);
        } 

    } 

}
