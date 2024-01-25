// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNewOptimizationItemDataRequest} extends {@link RequestModel}
 *
 * <p>GetNewOptimizationItemDataRequest</p>
 */
public class GetNewOptimizationItemDataRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetNewOptimizationItemDataRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNewOptimizationItemDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetNewOptimizationItemDataRequest, Builder> {
        private String lang; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetNewOptimizationItemDataRequest request) {
            super(request);
            this.lang = request.lang;
            this.operaUid = request.operaUid;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetNewOptimizationItemDataRequest build() {
            return new GetNewOptimizationItemDataRequest(this);
        } 

    } 

}
