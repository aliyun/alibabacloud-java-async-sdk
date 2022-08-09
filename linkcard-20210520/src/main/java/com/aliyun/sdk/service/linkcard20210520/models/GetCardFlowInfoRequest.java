// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardFlowInfoRequest} extends {@link RequestModel}
 *
 * <p>GetCardFlowInfoRequest</p>
 */
public class GetCardFlowInfoRequest extends Request {
    @Query
    @NameInMap("DateList")
    private java.util.List < String > dateList;

    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    private GetCardFlowInfoRequest(Builder builder) {
        super(builder);
        this.dateList = builder.dateList;
        this.iccid = builder.iccid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardFlowInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dateList
     */
    public java.util.List < String > getDateList() {
        return this.dateList;
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    public static final class Builder extends Request.Builder<GetCardFlowInfoRequest, Builder> {
        private java.util.List < String > dateList; 
        private String iccid; 

        private Builder() {
            super();
        } 

        private Builder(GetCardFlowInfoRequest request) {
            super(request);
            this.dateList = request.dateList;
            this.iccid = request.iccid;
        } 

        /**
         * DateList.
         */
        public Builder dateList(java.util.List < String > dateList) {
            this.putQueryParameter("DateList", dateList);
            this.dateList = dateList;
            return this;
        }

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        @Override
        public GetCardFlowInfoRequest build() {
            return new GetCardFlowInfoRequest(this);
        } 

    } 

}
