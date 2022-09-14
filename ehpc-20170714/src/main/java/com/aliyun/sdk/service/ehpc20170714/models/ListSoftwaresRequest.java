// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSoftwaresRequest} extends {@link RequestModel}
 *
 * <p>ListSoftwaresRequest</p>
 */
public class ListSoftwaresRequest extends Request {
    @Query
    @NameInMap("EhpcVersion")
    private String ehpcVersion;

    private ListSoftwaresRequest(Builder builder) {
        super(builder);
        this.ehpcVersion = builder.ehpcVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwaresRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ehpcVersion
     */
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    public static final class Builder extends Request.Builder<ListSoftwaresRequest, Builder> {
        private String ehpcVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListSoftwaresRequest request) {
            super(request);
            this.ehpcVersion = request.ehpcVersion;
        } 

        /**
         * EhpcVersion.
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        @Override
        public ListSoftwaresRequest build() {
            return new ListSoftwaresRequest(this);
        } 

    } 

}
