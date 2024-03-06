// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientKeysRequest} extends {@link RequestModel}
 *
 * <p>ListClientKeysRequest</p>
 */
public class ListClientKeysRequest extends Request {
    @Query
    @NameInMap("AapName")
    private String aapName;

    private ListClientKeysRequest(Builder builder) {
        super(builder);
        this.aapName = builder.aapName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientKeysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aapName
     */
    public String getAapName() {
        return this.aapName;
    }

    public static final class Builder extends Request.Builder<ListClientKeysRequest, Builder> {
        private String aapName; 

        private Builder() {
            super();
        } 

        private Builder(ListClientKeysRequest request) {
            super(request);
            this.aapName = request.aapName;
        } 

        /**
         * The name of the application access point (AAP).
         */
        public Builder aapName(String aapName) {
            this.putQueryParameter("AapName", aapName);
            this.aapName = aapName;
            return this;
        }

        @Override
        public ListClientKeysRequest build() {
            return new ListClientKeysRequest(this);
        } 

    } 

}
