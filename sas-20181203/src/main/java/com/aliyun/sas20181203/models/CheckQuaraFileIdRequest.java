// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CheckQuaraFileIdRequest} extends {@link RequestModel}
 *
 * <p>CheckQuaraFileIdRequest</p>
 */
public class CheckQuaraFileIdRequest extends Request {
    @Query
    @NameInMap("QuaraFileIds")
    private java.util.List < String > quaraFileIds;

    @Query
    @NameInMap("Uuid")
    private String uuid;


    private CheckQuaraFileIdRequest(Builder builder) {
        super(builder);
        this.quaraFileIds = builder.quaraFileIds;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckQuaraFileIdRequest create() {
        return builder().build();
    }

    /**
     * @return quaraFileIds
     */
    public java.util.List < String > getQuaraFileIds() {
        return this.quaraFileIds;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder {
        private java.util.List < String > quaraFileIds; 
        private String uuid; 

        /**
         * <p>QuaraFileIds.</p>
         */
        public Builder quaraFileIds(java.util.List < String > quaraFileIds) {
            this.putQueryParameter("QuaraFileIds", quaraFileIds);
            this.quaraFileIds = quaraFileIds;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public CheckQuaraFileIdRequest build() {
            return new CheckQuaraFileIdRequest(this);
        } 

    } 

}
