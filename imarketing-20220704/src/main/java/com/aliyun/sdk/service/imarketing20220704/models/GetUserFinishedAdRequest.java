// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserFinishedAdRequest} extends {@link RequestModel}
 *
 * <p>GetUserFinishedAdRequest</p>
 */
public class GetUserFinishedAdRequest extends Request {
    @Query
    @NameInMap("Adid")
    private Long adid;

    @Query
    @NameInMap("Clicklink")
    private String clicklink;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("Mediaid")
    private String mediaid;

    @Query
    @NameInMap("Tagid")
    private String tagid;

    @Query
    @NameInMap("Uid")
    private String uid;

    private GetUserFinishedAdRequest(Builder builder) {
        super(builder);
        this.adid = builder.adid;
        this.clicklink = builder.clicklink;
        this.id = builder.id;
        this.mediaid = builder.mediaid;
        this.tagid = builder.tagid;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserFinishedAdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adid
     */
    public Long getAdid() {
        return this.adid;
    }

    /**
     * @return clicklink
     */
    public String getClicklink() {
        return this.clicklink;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return mediaid
     */
    public String getMediaid() {
        return this.mediaid;
    }

    /**
     * @return tagid
     */
    public String getTagid() {
        return this.tagid;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetUserFinishedAdRequest, Builder> {
        private Long adid; 
        private String clicklink; 
        private String id; 
        private String mediaid; 
        private String tagid; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetUserFinishedAdRequest request) {
            super(request);
            this.adid = request.adid;
            this.clicklink = request.clicklink;
            this.id = request.id;
            this.mediaid = request.mediaid;
            this.tagid = request.tagid;
            this.uid = request.uid;
        } 

        /**
         * Adid.
         */
        public Builder adid(Long adid) {
            this.putQueryParameter("Adid", adid);
            this.adid = adid;
            return this;
        }

        /**
         * Clicklink.
         */
        public Builder clicklink(String clicklink) {
            this.putQueryParameter("Clicklink", clicklink);
            this.clicklink = clicklink;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Mediaid.
         */
        public Builder mediaid(String mediaid) {
            this.putQueryParameter("Mediaid", mediaid);
            this.mediaid = mediaid;
            return this;
        }

        /**
         * Tagid.
         */
        public Builder tagid(String tagid) {
            this.putQueryParameter("Tagid", tagid);
            this.tagid = tagid;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetUserFinishedAdRequest build() {
            return new GetUserFinishedAdRequest(this);
        } 

    } 

}
