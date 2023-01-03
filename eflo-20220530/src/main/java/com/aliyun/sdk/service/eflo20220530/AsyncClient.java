// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eflo20220530.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<CreateSubnetResponse> createSubnet(CreateSubnetRequest request);

    CompletableFuture<CreateVccResponse> createVcc(CreateVccRequest request);

    CompletableFuture<CreateVpdResponse> createVpd(CreateVpdRequest request);

    CompletableFuture<DeleteSubnetResponse> deleteSubnet(DeleteSubnetRequest request);

    CompletableFuture<DeleteVpdResponse> deleteVpd(DeleteVpdRequest request);

    CompletableFuture<GetSubnetResponse> getSubnet(GetSubnetRequest request);

    CompletableFuture<GetVccResponse> getVcc(GetVccRequest request);

    CompletableFuture<GetVpdResponse> getVpd(GetVpdRequest request);

    CompletableFuture<InitializeVccResponse> initializeVcc(InitializeVccRequest request);

    CompletableFuture<ListSubnetsResponse> listSubnets(ListSubnetsRequest request);

    CompletableFuture<ListVccsResponse> listVccs(ListVccsRequest request);

    CompletableFuture<ListVpdsResponse> listVpds(ListVpdsRequest request);

    CompletableFuture<UpdateSubnetResponse> updateSubnet(UpdateSubnetRequest request);

    CompletableFuture<UpdateVccResponse> updateVcc(UpdateVccRequest request);

    CompletableFuture<UpdateVpdResponse> updateVpd(UpdateVpdRequest request);

}
