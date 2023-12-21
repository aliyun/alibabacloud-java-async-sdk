// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListPakRenderExpressionRequest} extends {@link RequestModel}
 *
 * <p>PopListPakRenderExpressionRequest</p>
 */
public class PopListPakRenderExpressionRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Query
    @NameInMap("ListStatus")
    private String listStatus;

    @Body
    @NameInMap("Size")
    private Integer size;

    private PopListPakRenderExpressionRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.listStatus = builder.listStatus;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListPakRenderExpressionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return listStatus
     */
    public String getListStatus() {
        return this.listStatus;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<PopListPakRenderExpressionRequest, Builder> {
        private Integer current; 
        private String listStatus; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(PopListPakRenderExpressionRequest request) {
            super(request);
            this.current = request.current;
            this.listStatus = request.listStatus;
            this.size = request.size;
        } 

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * ListStatus.
         */
        public Builder listStatus(String listStatus) {
            this.putQueryParameter("ListStatus", listStatus);
            this.listStatus = listStatus;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public PopListPakRenderExpressionRequest build() {
            return new PopListPakRenderExpressionRequest(this);
        } 

    } 

}
