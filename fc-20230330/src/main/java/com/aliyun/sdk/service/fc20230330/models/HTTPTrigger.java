// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HTTPTrigger} extends {@link TeaModel}
 *
 * <p>HTTPTrigger</p>
 */
public class HTTPTrigger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("urlInternet")
    private String urlInternet;

    @com.aliyun.core.annotation.NameInMap("urlIntranet")
    private String urlIntranet;

    private HTTPTrigger(Builder builder) {
        this.urlInternet = builder.urlInternet;
        this.urlIntranet = builder.urlIntranet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HTTPTrigger create() {
        return builder().build();
    }

    /**
     * @return urlInternet
     */
    public String getUrlInternet() {
        return this.urlInternet;
    }

    /**
     * @return urlIntranet
     */
    public String getUrlIntranet() {
        return this.urlIntranet;
    }

    public static final class Builder {
        private String urlInternet; 
        private String urlIntranet; 

        /**
         * urlInternet.
         */
        public Builder urlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }

        /**
         * urlIntranet.
         */
        public Builder urlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }

        public HTTPTrigger build() {
            return new HTTPTrigger(this);
        } 

    } 

}
