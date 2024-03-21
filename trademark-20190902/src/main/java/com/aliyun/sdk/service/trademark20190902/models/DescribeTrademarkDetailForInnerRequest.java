// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrademarkDetailForInnerRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrademarkDetailForInnerRequest</p>
 */
public class DescribeTrademarkDetailForInnerRequest extends Request {
    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("Umid")
    private String umid;

    private DescribeTrademarkDetailForInnerRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.umid = builder.umid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrademarkDetailForInnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return umid
     */
    public String getUmid() {
        return this.umid;
    }

    public static final class Builder extends Request.Builder<DescribeTrademarkDetailForInnerRequest, Builder> {
        private String uid; 
        private String umid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrademarkDetailForInnerRequest request) {
            super(request);
            this.uid = request.uid;
            this.umid = request.umid;
        } 

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * Umid.
         */
        public Builder umid(String umid) {
            this.putQueryParameter("Umid", umid);
            this.umid = umid;
            return this;
        }

        @Override
        public DescribeTrademarkDetailForInnerRequest build() {
            return new DescribeTrademarkDetailForInnerRequest(this);
        } 

    } 

}
