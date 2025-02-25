// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAppOtaVersionsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppOtaVersionsRequest</p>
 */
public class DeleteAppOtaVersionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionUidList")
    private java.util.List < String > versionUidList;

    private DeleteAppOtaVersionsRequest(Builder builder) {
        super(builder);
        this.versionUidList = builder.versionUidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppOtaVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return versionUidList
     */
    public java.util.List < String > getVersionUidList() {
        return this.versionUidList;
    }

    public static final class Builder extends Request.Builder<DeleteAppOtaVersionsRequest, Builder> {
        private java.util.List < String > versionUidList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppOtaVersionsRequest request) {
            super(request);
            this.versionUidList = request.versionUidList;
        } 

        /**
         * VersionUidList.
         */
        public Builder versionUidList(java.util.List < String > versionUidList) {
            this.putQueryParameter("VersionUidList", versionUidList);
            this.versionUidList = versionUidList;
            return this;
        }

        @Override
        public DeleteAppOtaVersionsRequest build() {
            return new DeleteAppOtaVersionsRequest(this);
        } 

    } 

}
