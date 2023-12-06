// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductVersionDifferencesRequest} extends {@link RequestModel}
 *
 * <p>GetProductVersionDifferencesRequest</p>
 */
public class GetProductVersionDifferencesRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("versionUID")
    private String versionUID;

    @Query
    @NameInMap("preVersionUID")
    private String preVersionUID;

    private GetProductVersionDifferencesRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.versionUID = builder.versionUID;
        this.preVersionUID = builder.preVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionDifferencesRequest create() {
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
     * @return versionUID
     */
    public String getVersionUID() {
        return this.versionUID;
    }

    /**
     * @return preVersionUID
     */
    public String getPreVersionUID() {
        return this.preVersionUID;
    }

    public static final class Builder extends Request.Builder<GetProductVersionDifferencesRequest, Builder> {
        private String uid; 
        private String versionUID; 
        private String preVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(GetProductVersionDifferencesRequest request) {
            super(request);
            this.uid = request.uid;
            this.versionUID = request.versionUID;
            this.preVersionUID = request.preVersionUID;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * versionUID.
         */
        public Builder versionUID(String versionUID) {
            this.putPathParameter("versionUID", versionUID);
            this.versionUID = versionUID;
            return this;
        }

        /**
         * preVersionUID.
         */
        public Builder preVersionUID(String preVersionUID) {
            this.putQueryParameter("preVersionUID", preVersionUID);
            this.preVersionUID = preVersionUID;
            return this;
        }

        @Override
        public GetProductVersionDifferencesRequest build() {
            return new GetProductVersionDifferencesRequest(this);
        } 

    } 

}
