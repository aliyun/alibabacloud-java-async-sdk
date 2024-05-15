// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAddressBookRequest} extends {@link RequestModel}
 *
 * <p>DeleteAddressBookRequest</p>
 */
public class DeleteAddressBookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    private DeleteAddressBookRequest(Builder builder) {
        super(builder);
        this.groupUuid = builder.groupUuid;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAddressBookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteAddressBookRequest, Builder> {
        private String groupUuid; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAddressBookRequest request) {
            super(request);
            this.groupUuid = request.groupUuid;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The ID of the address book.
         * <p>
         * 
         * To delete the address book, you must provide the ID of the address book. You can call the DescribeAddressBook operation to query the ID.
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * The natural language of the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DeleteAddressBookRequest build() {
            return new DeleteAddressBookRequest(this);
        } 

    } 

}
