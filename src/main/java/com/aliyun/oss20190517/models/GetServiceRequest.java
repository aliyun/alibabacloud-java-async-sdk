// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetServiceRequest} extends {@link RequestModel}
 *
 * <p>GetServiceRequest</p>
 */
public class GetServiceRequest extends Request {
    @Query
    @NameInMap("marker")
    private String marker;

    @Query
    @NameInMap("max-keys")
    private Long maxKeys;

    @Query
    @NameInMap("prefix")
    private String prefix;


    private GetServiceRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceRequest create() {
        return builder().build();
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String marker; 
        private Long maxKeys; 
        private String prefix; 

        /**
         * <p>marker.</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>max-keys.</p>
         */
        public Builder maxKeys(Long maxKeys) {
            this.putQueryParameter("max-keys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>prefix.</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        public GetServiceRequest build() {
            return new GetServiceRequest(this);
        } 

    } 

}
