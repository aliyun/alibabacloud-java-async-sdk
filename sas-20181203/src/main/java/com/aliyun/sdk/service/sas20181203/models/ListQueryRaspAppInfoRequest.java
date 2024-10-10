// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListQueryRaspAppInfoRequest} extends {@link RequestModel}
 *
 * <p>ListQueryRaspAppInfoRequest</p>
 */
public class ListQueryRaspAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private ListQueryRaspAppInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryRaspAppInfoRequest create() {
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
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ListQueryRaspAppInfoRequest, Builder> {
        private String lang; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ListQueryRaspAppInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong></li>
         * <li><strong>en</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The UUIDs of the RASP-enabled applications. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>6541631a-7d47-41fd-9fef-9518113f****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ListQueryRaspAppInfoRequest build() {
            return new ListQueryRaspAppInfoRequest(this);
        } 

    } 

}
