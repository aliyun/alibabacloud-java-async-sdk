// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ABTestExperiment} extends {@link TeaModel}
 *
 * <p>ABTestExperiment</p>
 */
public class ABTestExperiment extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("online")
    private Boolean online;

    @NameInMap("params")
    private java.util.Map < String, String > params;

    @NameInMap("serialNumber")
    private Integer serialNumber;

    @NameInMap("traffic")
    private Integer traffic;

    private ABTestExperiment(Builder builder) {
        this.name = builder.name;
        this.online = builder.online;
        this.params = builder.params;
        this.serialNumber = builder.serialNumber;
        this.traffic = builder.traffic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ABTestExperiment create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return online
     */
    public Boolean getOnline() {
        return this.online;
    }

    /**
     * @return params
     */
    public java.util.Map < String, String > getParams() {
        return this.params;
    }

    /**
     * @return serialNumber
     */
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return traffic
     */
    public Integer getTraffic() {
        return this.traffic;
    }

    public static final class Builder {
        private String name; 
        private Boolean online; 
        private java.util.Map < String, String > params; 
        private Integer serialNumber; 
        private Integer traffic; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * online.
         */
        public Builder online(Boolean online) {
            this.online = online;
            return this;
        }

        /**
         * params.
         */
        public Builder params(java.util.Map < String, String > params) {
            this.params = params;
            return this;
        }

        /**
         * serialNumber.
         */
        public Builder serialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * traffic.
         */
        public Builder traffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }

        public ABTestExperiment build() {
            return new ABTestExperiment(this);
        } 

    } 

}
