// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteTagWithUuidRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagWithUuidRequest</p>
 */
public class DeleteTagWithUuidRequest extends Request {
    @Query
    @NameInMap("TagName")
    private String tagName;

    @Query
    @NameInMap("UuidList")
    private String uuidList;


    private DeleteTagWithUuidRequest(Builder builder) {
        super(builder);
        this.tagName = builder.tagName;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTagWithUuidRequest create() {
        return builder().build();
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return uuidList
     */
    public String getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder {
        private String tagName; 
        private String uuidList; 

        /**
         * <p>TagName.</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * <p>UuidList.</p>
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        public DeleteTagWithUuidRequest build() {
            return new DeleteTagWithUuidRequest(this);
        } 

    } 

}
