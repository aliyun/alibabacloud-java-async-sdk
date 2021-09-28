// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517;

import darabonba.core.*;
import darabonba.core.client.*;
import darabonba.core.interceptor.*;

/**
 * <p>Base client.</p>
 * <p>Can be overwritten by handwriting here.</p>
 */
public abstract class BaseClientBuilder<BuilderT extends IClientBuilder<BuilderT, ClientT>, ClientT> extends TeaClientBuilder<BuilderT, ClientT> {

    @Override
    protected String serviceName() {
        return "oss";
    }

    BuilderT serviceConfiguration(Configuration serviceConfiguration) {
        clientConfiguration.setOption(ClientOption.SERVICE_CONFIGURATION, serviceConfiguration);
        return (BuilderT) this;
    }

}
